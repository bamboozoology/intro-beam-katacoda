#!/usr/bin/python

#CHECKING ANSWERS FOR MULTIPLY BY 10 PARDO

def check_multiply_by_ten_pardo():
	set_of_answers = set(['10','20','30','40','50'])
	#print(set_of_answers)
	set_in_file = set()

	with open('/home/intro-beam-katacoda/multiply_by_ten_pardo-00000-of-00001.txt') as f:
		for line in f:
			set_in_file.add(line.strip())

	exit(0) if set_of_answers == set_in_file else exit(1)

check_multiply_by_ten_pardo()
