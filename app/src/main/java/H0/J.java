package H0;

import N0.C1046e;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import id.AbstractC3557B;
import java.util.List;
import java.util.function.Consumer;
import m.RunnableC4517N;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f6759a = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = r0.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        r0 = r0.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(O o10, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        L0.o oVar;
        wf.k kVar;
        int i10 = 0;
        while (i10 < longSparseArray.size()) {
            int i11 = i10 + 1;
            long keyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse o11 = A1.b.o(longSparseArray.get(keyAt));
            if (o11 != null && value != null && text != null) {
                int[] iArr = O.f6796V0;
                S0 s02 = (S0) o10.t().get(Integer.valueOf((int) keyAt));
                if (s02 != null && (oVar = s02.f6878a) != null) {
                    L0.a aVar = (L0.a) U3.f.T(oVar.f10421d, L0.i.f10392i);
                    if (aVar != null && (kVar = (wf.k) aVar.f10369b) != null) {
                        Boolean bool = (Boolean) kVar.invoke(new C1046e(text.toString(), null, 6));
                    }
                }
            }
            i10 = i11;
        }
    }

    public final void b(O o10, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        L0.o oVar;
        AutofillId autofillId;
        String str;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j6 : jArr) {
            int[] iArr2 = O.f6796V0;
            S0 s02 = (S0) o10.t().get(Integer.valueOf((int) j6));
            if (s02 != null && (oVar = s02.f6878a) != null) {
                A1.b.s();
                autofillId = o10.f6818i0.getAutofillId();
                ViewTranslationRequest.Builder m10 = A1.b.m(autofillId, oVar.f10424g);
                List list = (List) U3.f.T(oVar.f10421d, L0.r.f10466v);
                if (list != null) {
                    str = Gi.e.w(list, Separators.RETURN, null, 62);
                } else {
                    str = null;
                }
                if (str != null) {
                    forText = TranslationRequestValue.forText(new C1046e(str, null, 6));
                    m10.setValue("android:text", forText);
                    build = m10.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(O o10, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC3557B.K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(o10, longSparseArray);
        } else {
            o10.f6818i0.post(new RunnableC4517N(o10, 1, longSparseArray));
        }
    }
}
