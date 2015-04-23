(ns briancain.clj-luhn.core-test
  (:require [clojure.test :refer :all]
            [briancain.clj-luhn.core :refer :all]))

(deftest valid?-test
  (testing "if a credit card number is valid"
    (is (valid? 49927398716)))
  (testing "if a credit card number is not valid"
    (is (not (valid? 79927398710))))
  (testing "visa numbers"
    (is (valid? 4111111111111111)))
  (testing "accepts strings"
    (is (valid? "49927398716"))))

(deftest check-digit-test
  (testing "obtains the check digit from a card"
    (is (= 3 (check-digit 79927398710)))))
