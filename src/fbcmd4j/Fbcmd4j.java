package fbcmd4j;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.IdNameEntity;
import facebook4j.Like;
import facebook4j.Link;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Privacy;
import facebook4j.ResponseList;
import facebook4j.FacebookResponse.Metadata;
import facebook4j.auth.AccessToken;


public class Fbcmd4j {

	static final Logger logger = LogManager.getLogger(Facebook.class);
	private static String appId = "304222873824632";
	private static String appSecret= "7ba79824a1f0505ec56a010b1f35623b";
	private static Scanner scan;

	
	public static void main(String[] args) throws FacebookException {
		// TODO Auto-generated method stub

	}
}