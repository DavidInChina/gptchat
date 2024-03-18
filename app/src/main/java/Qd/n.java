package Qd;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dh.C2675A;
import dh.C2676B;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f14639Y = new kotlin.jvm.internal.o(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        boolean z10 = false;
        o[] values = o.values();
        String[] strArr = {"track", "screen", "alias", "identify", "group"};
        Annotation[][] annotationArr = {null, null, null, null, null};
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, values);
        C2675A c2675a = new C2675A("com.segment.analytics.kotlin.core.EventType", values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            o oVar = values[i10];
            int i12 = i11 + 1;
            String str = (String) kf.q.n3(i11, strArr);
            if (str == null) {
                str = oVar.name();
            }
            c2675a.k(str, z10);
            Annotation[] annotationArr2 = (Annotation[]) kf.q.n3(i11, annotationArr);
            if (annotationArr2 != null) {
                int length2 = annotationArr2.length;
                for (int i13 = z10; i13 < length2; i13++) {
                    Annotation annotation = annotationArr2[i13];
                    AbstractC3557B.c0("annotation", annotation);
                    int i14 = c2675a.f37652d;
                    List[] listArr = c2675a.f37654f;
                    List list = listArr[i14];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[c2675a.f37652d] = list;
                    }
                    list.add(annotation);
                }
            }
            i10++;
            i11 = i12;
            z10 = false;
        }
        return new C2676B("com.segment.analytics.kotlin.core.EventType", values, c2675a);
    }
}
