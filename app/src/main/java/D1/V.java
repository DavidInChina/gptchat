package D1;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class V {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0353h b(View view, C0353h c0353h) {
        ContentInfo m10 = c0353h.f3268a.m();
        Objects.requireNonNull(m10);
        ContentInfo i10 = A1.b.i(m10);
        ContentInfo performReceiveContent = view.performReceiveContent(i10);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == i10) {
            return c0353h;
        }
        return new C0353h(new F4.a(performReceiveContent));
    }

    public static void c(View view, String[] strArr, AbstractC0375v abstractC0375v) {
        if (abstractC0375v == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new W(abstractC0375v));
        }
    }
}
