package G5;

import Kg.p;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import wf.k;
import zc.C6821H;

/* loaded from: classes.dex */
public final class b extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6052Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Charset f6053Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Charset charset) {
        super(1);
        this.f6052Y = i10;
        this.f6053Z = charset;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f6052Y;
        th = null;
        Charset charset = this.f6053Z;
        switch (i10) {
            case 0:
                File file = (File) obj;
                AbstractC3557B.c0("$this$safeCall", file);
                AbstractC3557B.c0("charset", charset);
                ArrayList arrayList = new ArrayList();
                C6821H c6821h = new C6821H(23, arrayList);
                try {
                    for (Object obj2 : p.a1(new kf.p(new BufferedReader(new InputStreamReader(N.t(new FileInputStream(file), file), charset))))) {
                        c6821h.invoke(obj2);
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                    }
                }
            default:
                File file2 = (File) obj;
                AbstractC3557B.c0("$this$safeCall", file2);
                AbstractC3557B.c0("charset", charset);
                try {
                    return P4.a.x0(new InputStreamReader(N.t(new FileInputStream(file2), file2), charset));
                } finally {
                }
        }
    }
}
