package v;

import H2.f;
import H2.l;
import H2.o;
import H2.p;
import Z.U;
import h3.C3315d;
import id.AbstractC3557B;
import io.sentry.C3651h1;
import io.sentry.S;
import io.sentry.android.core.V;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jf.C3959i;
import o3.C4907c;
import o3.C4908d;
import p2.C5065s;
import w2.j;
import x8.C;
import x8.j0;

/* renamed from: v.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5934c implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46834Y;

    public /* synthetic */ C5934c(int i10) {
        this.f46834Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = -1;
        switch (this.f46834Y) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr != bArr2) {
                    if (bArr == null) {
                        return -1;
                    }
                    if (bArr2 == null) {
                        return 1;
                    }
                    for (int i11 = 0; i11 < Math.min(bArr.length, bArr2.length); i11++) {
                        byte b10 = bArr[i11];
                        byte b11 = bArr2[i11];
                        if (b10 != b11) {
                            return b10 - b11;
                        }
                    }
                    if (bArr.length != bArr2.length) {
                        return bArr.length - bArr2.length;
                    }
                }
                return 0;
            case 1:
                return AbstractC3557B.e0(((U) obj).f22572b, ((U) obj2).f22572b);
            case 2:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
                if (aVar.H() == aVar2.H()) {
                    return AbstractC3557B.e0(aVar.F(), aVar2.F());
                }
                return Float.compare(aVar.H(), aVar2.H());
            case 3:
                C3959i c3959i = (C3959i) obj;
                C3959i c3959i2 = (C3959i) obj2;
                return (((Number) c3959i.f36156Z).intValue() - ((Number) c3959i.f36155Y).intValue()) - (((Number) c3959i2.f36156Z).intValue() - ((Number) c3959i2.f36155Y).intValue());
            case 4:
                byte[] bArr3 = (byte[]) obj;
                byte[] bArr4 = (byte[]) obj2;
                if (bArr3.length != bArr4.length) {
                    return bArr3.length - bArr4.length;
                }
                for (int i12 = 0; i12 < bArr3.length; i12++) {
                    byte b12 = bArr3[i12];
                    byte b13 = bArr4[i12];
                    if (b12 != b13) {
                        return b12 - b13;
                    }
                }
                return 0;
            case 5:
                j jVar = (j) obj;
                j jVar2 = (j) obj2;
                long j6 = jVar.f47693k0;
                long j10 = jVar2.f47693k0;
                if (j6 - j10 == 0) {
                    return jVar.compareTo(jVar2);
                }
                if (j6 >= j10) {
                    i10 = 1;
                }
                return i10;
            case 6:
                return ((C5065s) obj2).f42315m0 - ((C5065s) obj).f42315m0;
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                j0 j0Var = p.f7318i;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 8:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                j0 j0Var2 = p.f7318i;
                return 0;
            case 9:
                return ((f) Collections.max((List) obj)).compareTo((f) Collections.max((List) obj2));
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C.f(new C5934c(14).compare((o) Collections.max(list, new C5934c(12)), (o) Collections.max(list2, new C5934c(13)))).a(list.size(), list2.size()).b((o) Collections.max(list, new C5934c(15)), (o) Collections.max(list2, new C5934c(16)), new C5934c(17)).e();
            case 11:
                return ((l) ((List) obj).get(0)).compareTo((l) ((List) obj2).get(0));
            case 12:
                return o.d((o) obj, (o) obj2);
            case 13:
                return o.d((o) obj, (o) obj2);
            case 14:
                return o.d((o) obj, (o) obj2);
            case 15:
                return o.c((o) obj, (o) obj2);
            case 16:
                return o.c((o) obj, (o) obj2);
            case 17:
                return o.c((o) obj, (o) obj2);
            case 18:
                return ((I2.o) obj).f8011a - ((I2.o) obj2).f8011a;
            case 19:
                return Float.compare(((I2.o) obj).f8013c, ((I2.o) obj2).f8013c);
            case 20:
            default:
                Charset charset = io.sentry.cache.c.f34288l0;
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 21:
                return Integer.compare(((C3315d) obj2).f31816b, ((C3315d) obj).f31816b);
            case 22:
                return Integer.compare(((C4908d) obj).f40550a.f40553b, ((C4908d) obj2).f40550a.f40553b);
            case 23:
                return Long.compare(((C4907c) obj).f40547b, ((C4907c) obj2).f40547b);
            case 24:
                S s10 = (S) obj;
                S s11 = (S) obj2;
                C3651h1 c3651h1 = V.f34063i;
                int compareTo = s10.x().compareTo(s11.x());
                if (compareTo == 0) {
                    return s10.s().f33715Z.f33753Y.compareTo(s11.s().f33715Z.f33753Y);
                }
                return compareTo;
        }
    }
}
