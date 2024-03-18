package L3;

import M3.C0934c;
import android.os.Build;
import id.AbstractC3557B;
import java.util.concurrent.ExecutorService;

/* renamed from: L3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889a {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f10684a = AbstractC3557B.H(false);

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f10685b = AbstractC3557B.H(true);

    /* renamed from: c  reason: collision with root package name */
    public final R4.a f10686c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final E f10687d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final t f10688e = t.f10732l;

    /* renamed from: f  reason: collision with root package name */
    public final C0934c f10689f = new C0934c();

    /* renamed from: g  reason: collision with root package name */
    public final int f10690g = 4;

    /* renamed from: h  reason: collision with root package name */
    public final int f10691h = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public final int f10692i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10693j;

    /* JADX WARN: Type inference failed for: r2v5, types: [R4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, L3.E] */
    public C0889a(R4.a aVar) {
        int i10;
        if (Build.VERSION.SDK_INT == 23) {
            i10 = 10;
        } else {
            i10 = 20;
        }
        this.f10693j = i10;
        this.f10692i = 8;
    }
}
