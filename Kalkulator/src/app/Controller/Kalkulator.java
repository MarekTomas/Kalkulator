
package app.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Kalkulator {
	public static double liczba1;
	public static double liczba2;
	public static String znak;
	public static double resault;

	@FXML
	private Button bt_1;

	@FXML
	private Button bt_2;

	@FXML
	private Button bt_3;

	@FXML
	private Button bt_4;

	@FXML
	private Button bt_5;

	@FXML
	private Button bt_6;

	@FXML
	private Button bt_8;

	@FXML
	private Button bt_9;

	@FXML
	private Button bt_0;

	@FXML
	private Button bt_00;

	@FXML
	private Button bt_kropka;

	@FXML
	private Button bt_plus;

	@FXML
	private Button bt_minus;

	@FXML
	private Button bt_mnozenie;

	@FXML
	private Button bt_dzielenie;

	@FXML
	private Button bt_procent;

	@FXML
	private Button bt_wynik;

	@FXML
	private TextField wynik;

	@FXML
	private TextArea wyswietl;

	@FXML
	void buttonKasuj(MouseEvent event) {
		if (wynik.getText() != null) {
			wynik.deleteText(wynik.getText().length() - 1, wynik.getText().length());
		}
	}

	@FXML
	void buttonWyczysc(MouseEvent event) {
		if (wyswietl.getText() != null) {
			wyswietl.deleteText(0, wyswietl.getText().length());
		}
		if (wynik.getText() != null) {
			wynik.deleteText(0, wynik.getText().length());
		}
	}


	@FXML
	void buttonDodaj(MouseEvent event) {
		znak = "+";
		liczba1 = Double.parseDouble(wynik.getText());
		wyswietl.appendText(wynik.getText() + " " + znak + " ");
		wynik.deleteText(0, wynik.getText().length());

	}

	@FXML
	void buttonOdejmij(MouseEvent event) {
		znak = "-";
		liczba1 = Double.parseDouble(wynik.getText());
		wyswietl.appendText(wynik.getText() + " " + znak + " ");
		wynik.deleteText(0, wynik.getText().length());

	}

	@FXML
	void buttonPodziel(MouseEvent event) {
		znak = "/";
		liczba1 = Double.parseDouble(wynik.getText());
		wyswietl.appendText(wynik.getText() + " " + znak + " ");
		wynik.deleteText(0, wynik.getText().length());

	}

	@FXML
	void buttonPomnoz(MouseEvent event) {
		znak = "*";
		liczba1 = Double.parseDouble(wynik.getText());
		wyswietl.appendText(wynik.getText() + " " + znak + " ");
		wynik.deleteText(0, wynik.getText().length());
	}

	@FXML
	void buttonProcent(MouseEvent event) {
		znak = "%";
		liczba1 = Double.parseDouble(wynik.getText());
		wyswietl.appendText(wynik.getText() + " " + znak + " ");
		wynik.deleteText(0, wynik.getText().length());

	}

	@FXML
	void buttonWpisz0(MouseEvent event) {
		String liczba = "0";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz00(MouseEvent event) {
		String liczba = "00";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz1(MouseEvent event) {
		String liczba = "1";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz2(MouseEvent event) {
		String liczba = "2";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}

	}

	@FXML
	void buttonWpisz3(MouseEvent event) {
		String liczba = "3";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz4(MouseEvent event) {
		String liczba = "4";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz5(MouseEvent event) {
		String liczba = "5";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz6(MouseEvent event) {
		String liczba = "6";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz7(MouseEvent event) {
		String liczba = "7";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz8(MouseEvent event) {
		String liczba = "8";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpisz9(MouseEvent event) {
		String liczba = "9";
		if (wynik.getText() != null) {
			wynik.appendText(liczba);
		}
	}

	@FXML
	void buttonWpiszKropka(MouseEvent event) {
		String znak = ".";
		if (wynik.getText() != null) {
			wynik.appendText(znak);
		}
	}

	@FXML
	void buttonwynik(MouseEvent event) {
		String odpowiedz;
		liczba2 = Double.parseDouble(wynik.getText());
		if (znak == "+") {
			resault = liczba1 + liczba2;
			odpowiedz = String.format("%.2f", resault);
			wyswietl.appendText(wynik.getText() + " ");
			wynik.setText(odpowiedz);
		} else if (znak == "-") {
			resault = liczba1 - liczba2;
			odpowiedz = String.format("%.2f", resault);
			wyswietl.appendText(wynik.getText() + " ");
			wynik.setText(odpowiedz);

		} else if (znak == "*") {
			resault = liczba1 * liczba2;
			odpowiedz = String.format("%.2f", resault);
			wyswietl.appendText(wynik.getText() + " ");
			wynik.setText(odpowiedz);

		} else if (znak == "/") {
			resault = liczba1 / liczba2;
			odpowiedz = String.format("%.2f", resault);
			wyswietl.appendText(wynik.getText() + " ");
			wynik.setText(odpowiedz);

		} else if (znak == "%") {
			resault = liczba1 * (liczba2 / 100);
			odpowiedz = String.format("%.2f", resault);
			wyswietl.appendText(wynik.getText() + " ");
			wynik.setText(odpowiedz);

		}
	}

}
