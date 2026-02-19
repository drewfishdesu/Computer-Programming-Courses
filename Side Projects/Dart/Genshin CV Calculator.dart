import 'dart:io';
import 'dart:math';

void main() {
  var(crit_rate, crit_damage) = getVariables();
  double crit_value = (crit_rate * 2) + (crit_damage); 
  printCV(crit_value);
}

(double, double) getVariables() {
  print('Welcome to the Dart Genshin CV Calculator!');

  print('Please enter your crit rate (in percentage):');
  String? crit_rateInput = stdin.readLineSync();

  print('Please enter your crit damage (in percentage):');
  String? crit_damageInput = stdin.readLineSync();

  // Parse strings to doubles
  double cr = double.tryParse(crit_rateInput ?? '0') ?? 0.0;
  double cd = double.tryParse(crit_damageInput ?? '0') ?? 0.0;

  return (cr, cd);
}

void printCV(double crit_value) {
  print('------------------------------');
  print('Your Crit Value (CV) is: ${crit_value.toStringAsFixed(2)}');
}