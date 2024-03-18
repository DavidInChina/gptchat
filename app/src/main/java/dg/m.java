package Dg;

import Bg.Y;
import Mf.AbstractC1003l;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kf.v;
import kg.C4294f;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f3709a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final f f3710b = f.f3654Y;

    /* renamed from: c  reason: collision with root package name */
    public static final a f3711c = new a(C4294f.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* renamed from: d  reason: collision with root package name */
    public static final j f3712d = c(l.f3693m0, new String[0]);

    /* renamed from: e  reason: collision with root package name */
    public static final j f3713e = c(l.f3706z0, new String[0]);

    /* renamed from: f  reason: collision with root package name */
    public static final Set f3714f = R4.b.W1(new g());

    /* JADX WARN: Type inference failed for: r2v0, types: [Dg.m, java.lang.Object] */
    static {
        b[] bVarArr = b.f3651Y;
    }

    public static final h a(i iVar, boolean z10, String... strArr) {
        AbstractC3557B.c0("formatParams", strArr);
        if (z10) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            AbstractC3557B.c0("formatParams", strArr2);
            return new h(iVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        }
        return new h(iVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final h b(i iVar, String... strArr) {
        return a(iVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final j c(l lVar, String... strArr) {
        v vVar = v.f37483Y;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC3557B.c0("formatParams", strArr2);
        return e(lVar, vVar, d(lVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static k d(l lVar, String... strArr) {
        AbstractC3557B.c0("formatParams", strArr);
        return new k(lVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static j e(l lVar, List list, Y y10, String... strArr) {
        AbstractC3557B.c0("formatParams", strArr);
        return new j(y10, b(i.f3663j0, y10.toString()), lVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null && ((abstractC1003l instanceof a) || (abstractC1003l.mo20k() instanceof a) || abstractC1003l == f3710b)) {
            return true;
        }
        return false;
    }
}
