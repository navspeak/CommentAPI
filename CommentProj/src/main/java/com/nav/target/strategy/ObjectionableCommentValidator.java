package com.nav.target.strategy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.nav.target.domain.Comment;

@Component
public class ObjectionableCommentValidator implements ICommentValidation {

	private String regex = "bad";

	@Override
	public Boolean validateComment(Comment comment) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(comment.getText());
		if (matcher.find())
			return false;
		else
			return true;
	}

	public String getRegex() {return regex;	}
	public void setRegex(String regex) {this.regex = regex;	}
}
