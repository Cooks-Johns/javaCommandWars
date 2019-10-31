

// The SHA (Secure Hash Algorithm) is one of the popular cryptographic hash functions.

//------------ MAVEN 

// <dependency>
//     <groupId>org.bouncycastle</groupId>
//     <artifactId>bcprov-jdk15on</artifactId>
//     <version>1.60</version>
// </dependency>
// ---------------------

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaHashing {


public static void main(String [] args) throws NoSuchAlgorithmException {

	// Read and save the input String 
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	scan.close();

	// Encode the String using SHA-256
	MessageDigest md = MessageDigest.getInstance("SHA-256");
	md.update(str.getBytes());
	byte[] digest = md.digest();

	// Print the Encoded value in hexadecimal 
	for (byte b : digest) {
		System.out.format("%02x", b);
	}

	}
}