package Fe;

import Df.H;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Pg.o f5350Y;

    /* renamed from: Z  reason: collision with root package name */
    public ArrayList f5351Z;

    /* renamed from: h0  reason: collision with root package name */
    public SecureRandom f5352h0;

    /* renamed from: i0  reason: collision with root package name */
    public SecureRandom f5353i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte[] f5354j0;

    /* renamed from: k0  reason: collision with root package name */
    public byte[] f5355k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f5356l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f5357m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f5358n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f5359o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f5360p0;

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new AbstractC5163j(2, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[Catch: all -> 0x0035, LOOP:1: B:25:0x00c2->B:26:0x00c4, LOOP_END, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x0020, B:24:0x00ba, B:26:0x00c4, B:27:0x00cd, B:29:0x00d9, B:30:0x00e7, B:31:0x00ea, B:35:0x0102, B:38:0x010e, B:44:0x0118, B:45:0x012e, B:47:0x0148, B:50:0x016a, B:51:0x016c, B:53:0x017c), top: B:66:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x0020, B:24:0x00ba, B:26:0x00c4, B:27:0x00cd, B:29:0x00d9, B:30:0x00e7, B:31:0x00ea, B:35:0x0102, B:38:0x010e, B:44:0x0118, B:45:0x012e, B:47:0x0148, B:50:0x016a, B:51:0x016c, B:53:0x017c), top: B:66:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x0020, B:24:0x00ba, B:26:0x00c4, B:27:0x00cd, B:29:0x00d9, B:30:0x00e7, B:31:0x00ea, B:35:0x0102, B:38:0x010e, B:44:0x0118, B:45:0x012e, B:47:0x0148, B:50:0x016a, B:51:0x016c, B:53:0x017c), top: B:66:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x0020, B:24:0x00ba, B:26:0x00c4, B:27:0x00cd, B:29:0x00d9, B:30:0x00e7, B:31:0x00ea, B:35:0x0102, B:38:0x010e, B:44:0x0118, B:45:0x012e, B:47:0x0148, B:50:0x016a, B:51:0x016c, B:53:0x017c), top: B:66:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:6:0x0020, B:24:0x00ba, B:26:0x00c4, B:27:0x00cd, B:29:0x00d9, B:30:0x00e7, B:31:0x00ea, B:35:0x0102, B:38:0x010e, B:44:0x0118, B:45:0x012e, B:47:0x0148, B:50:0x016a, B:51:0x016c, B:53:0x017c), top: B:66:0x0020 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x012e -> B:46:0x0146). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0167 -> B:50:0x016a). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pg.o oVar;
        long j6;
        byte[] bArr;
        byte[] bArr2;
        List list;
        SecureRandom secureRandom;
        SecureRandom secureRandom2;
        int i10;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        int length;
        int i12;
        long currentTimeMillis;
        String X10;
        int length2;
        int i13;
        ArrayList arrayList3;
        int i14;
        int i15;
        int i16;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i17 = this.f5360p0;
        int i18 = 1;
        if (i17 != 0) {
            if (i17 == 1) {
                i11 = this.f5359o0;
                i10 = this.f5358n0;
                long j10 = this.f5357m0;
                list = this.f5356l0;
                byte[] bArr3 = this.f5355k0;
                byte[] bArr4 = this.f5354j0;
                SecureRandom secureRandom3 = this.f5353i0;
                SecureRandom secureRandom4 = this.f5352h0;
                ArrayList arrayList4 = this.f5351Z;
                oVar = this.f5350Y;
                try {
                    N.B0(obj);
                    int i19 = 1;
                    arrayList = arrayList4;
                    bArr = bArr3;
                    bArr2 = bArr4;
                    secureRandom = secureRandom3;
                    secureRandom2 = secureRandom4;
                    j6 = j10;
                    i10 += i19;
                    if (i10 >= i11) {
                        Object obj2 = list.get(i10);
                        this.f5350Y = oVar;
                        this.f5351Z = arrayList;
                        this.f5352h0 = secureRandom2;
                        this.f5353i0 = secureRandom;
                        this.f5354j0 = bArr2;
                        this.f5355k0 = bArr;
                        this.f5356l0 = list;
                        this.f5357m0 = j6;
                        this.f5358n0 = i10;
                        this.f5359o0 = i11;
                        i19 = 1;
                        this.f5360p0 = 1;
                        if (oVar.n(obj2, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        i10 += i19;
                        if (i10 >= i11) {
                            arrayList.clear();
                            int size = list.size();
                            for (int size2 = list.size() / 2; size2 < size; size2++) {
                                arrayList.add(list.get(size2));
                            }
                            arrayList2 = arrayList;
                            i18 = 1;
                            secureRandom2.nextBytes(bArr2);
                            secureRandom.nextBytes(bArr);
                            length = bArr2.length;
                            for (i12 = 0; i12 < length; i12++) {
                                bArr[i12 * 4] = bArr2[i12];
                            }
                            currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - j6 <= 30000) {
                                secureRandom.setSeed(j6 - currentTimeMillis);
                                secureRandom.setSeed(secureRandom2.generateSeed(bArr2.length));
                                j6 = currentTimeMillis;
                            } else {
                                secureRandom.setSeed(bArr2);
                            }
                            X10 = H.X(bArr);
                            N.g(16, 16);
                            length2 = X10.length();
                            int i20 = length2 / 16;
                            if (length2 % 16 != 0) {
                                i13 = 0;
                            } else {
                                i13 = i18;
                            }
                            arrayList3 = new ArrayList(i20 + i13);
                            i14 = 0;
                            while (i14 >= 0 && i14 < length2) {
                                i15 = i14 + 16;
                                if (i15 >= 0 && i15 <= length2) {
                                    i16 = i15;
                                    CharSequence subSequence = X10.subSequence(i14, i16);
                                    AbstractC3557B.c0("it", subSequence);
                                    arrayList3.add(subSequence.toString());
                                    i14 = i15;
                                }
                                i16 = length2;
                                CharSequence subSequence2 = X10.subSequence(i14, i16);
                                AbstractC3557B.c0("it", subSequence2);
                                arrayList3.add(subSequence2.toString());
                                i14 = i15;
                            }
                            List N22 = kf.t.N2(kf.t.w2(arrayList2, arrayList3));
                            Collections.shuffle(N22, secureRandom);
                            list = N22;
                            i11 = ((ArrayList) N22).size() / 2;
                            arrayList = arrayList2;
                            i10 = 0;
                            if (i10 >= i11) {
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        oVar.l(th2);
                        oVar.l(null);
                        return jf.y.f36177a;
                    } catch (Throwable th3) {
                        oVar.l(null);
                        throw th3;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Pg.k kVar = t.f5362b;
            arrayList2 = new ArrayList();
            String property = System.getProperty("io.ktor.random.secure.random.provider");
            if (property == null || (secureRandom2 = t.a(property)) == null) {
                Iterator it = t.f5361a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        SecureRandom a5 = t.a((String) it.next());
                        if (a5 != null) {
                            secureRandom2 = a5;
                            break;
                        }
                    } else {
                        Ei.b.e("io.ktor.util.random").b("None of the " + kf.t.m2(t.f5361a, ", ", null, null, null, 62) + " found, fallback to default");
                        secureRandom2 = t.a(null);
                        if (secureRandom2 == null) {
                            throw new IllegalStateException("No SecureRandom implementation found".toString());
                        }
                    }
                }
            }
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            bArr2 = new byte[128];
            bArr = new byte[512];
            secureRandom.setSeed(secureRandom2.generateSeed(128));
            j6 = 0;
            oVar = kVar;
            secureRandom2.nextBytes(bArr2);
            secureRandom.nextBytes(bArr);
            length = bArr2.length;
            while (i12 < length) {
            }
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j6 <= 30000) {
            }
            X10 = H.X(bArr);
            N.g(16, 16);
            length2 = X10.length();
            int i202 = length2 / 16;
            if (length2 % 16 != 0) {
            }
            arrayList3 = new ArrayList(i202 + i13);
            i14 = 0;
            while (i14 >= 0) {
                i15 = i14 + 16;
                if (i15 >= 0) {
                    i16 = i15;
                    CharSequence subSequence22 = X10.subSequence(i14, i16);
                    AbstractC3557B.c0("it", subSequence22);
                    arrayList3.add(subSequence22.toString());
                    i14 = i15;
                }
                i16 = length2;
                CharSequence subSequence222 = X10.subSequence(i14, i16);
                AbstractC3557B.c0("it", subSequence222);
                arrayList3.add(subSequence222.toString());
                i14 = i15;
            }
            List N222 = kf.t.N2(kf.t.w2(arrayList2, arrayList3));
            Collections.shuffle(N222, secureRandom);
            list = N222;
            i11 = ((ArrayList) N222).size() / 2;
            arrayList = arrayList2;
            i10 = 0;
            if (i10 >= i11) {
            }
        }
    }
}
