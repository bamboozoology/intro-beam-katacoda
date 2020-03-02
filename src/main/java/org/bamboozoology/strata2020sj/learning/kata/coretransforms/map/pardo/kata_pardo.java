package org.bamboozoology.strata2020sj.learning.kata.coretransforms.map.pardo;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.ToString;

public class kata_pardo_solution {

  public static void main(String[] args) {
    PipelineOptions options = PipelineOptionsFactory.fromArgs(args).create();
    Pipeline pipeline = Pipeline.create(options);

    PCollection<Integer> numbers =
        pipeline.apply(Create.of(1, 2, 3, 4, 5));

    PCollection<Integer> transformed = applyTransform(numbers);

    PCollection<String> output = transformed.apply(ToString.elements());

    output.apply(TextIO.write()
      .to("multiply_by_ten_pardo")    
      .withSuffix(".txt")
      .withNumShards(1)
    );

    pipeline.run();
  }

  static PCollection<Integer> applyTransform(PCollection<Integer> input) {
    return #TODO
    
  }

}




