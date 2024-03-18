package H1;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* loaded from: classes2.dex */
public abstract class w {
    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
