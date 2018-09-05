package bruce.zhao;

import hex.genmodel.MojoModel;
import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.exception.PredictException;
import hex.genmodel.easy.prediction.BinomialModelPrediction;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zhaoweipc
 */
public class Main {
    public static void main(String[] args) throws IOException, PredictException {
        String ModelPath = Main.class.getResource("/GBM_model_R_1536024753790_103.zip").getFile();
        System.out.println(ModelPath);
        EasyPredictModelWrapper model = new EasyPredictModelWrapper(
                MojoModel.load(ModelPath));

        RowData row = new RowData();
        row.put("AGE", "71");
        row.put("RACE", "1");
        row.put("DCAPS", "2");
        row.put("VOL", "0");
        row.put("GLEASON", "8");

        BinomialModelPrediction pred = model.predictBinomial(row);

        // 结果打印
        System.out.println("Has penetrated the prostatic capsule (1=yes; 0=no): " + pred.label);
//        System.out.print("Class probabilities: ");
//        for (int i = 0; i < pred.classProbabilities.length; i++) {
//            if(i > 0) {
//                System.out.print(",");
//            }
//            System.out.print(pred.classProbabilities[i]);
//        }
//        System.out.println("");

        System.out.println("labelIndex: " + pred.labelIndex);
        System.out.println("label: " + pred.label);
        System.out.println("classProbability0: " + pred.classProbabilities[0]);
        System.out.println("classProbability1: " + pred.classProbabilities[1]);
    }

}
