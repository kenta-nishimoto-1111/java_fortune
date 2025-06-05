package com.example.sample_fortune.service;

import org.springframework.stereotype.Service;
import java.util.Random;


@Service  // ← このアノテーションがポイント
public class SampleService {
  public String getFortune(){
    Random random = new Random();
    int num = random.nextInt(3);

    String[] fortunes = {"大", "吉", "凶"};
    return fortunes[num];
  }
}
