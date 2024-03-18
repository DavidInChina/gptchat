package N2;

import java.util.Arrays;
import l8.AbstractC4344b;
import p2.C5065s;
import p2.r;
import s2.AbstractC5530A;
import s2.p;
import s2.u;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final N f12679a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12680b;

    public f(int i10, k0 k0Var) {
        this.f12680b = i10;
        this.f12679a = k0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, u uVar) {
        a aVar;
        int i11;
        String str;
        String str2;
        int i12 = 4;
        AbstractC4344b.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i13 = uVar.f45195c;
        int i14 = 0;
        int i15 = -2;
        int i16 = 0;
        while (uVar.a() > 8) {
            int i17 = uVar.i();
            int i18 = uVar.f45194b + uVar.i();
            uVar.E(i18);
            if (i17 == 1414744396) {
                aVar = b(uVar.i(), uVar);
            } else {
                g gVar = null;
                switch (i17) {
                    case 1718776947:
                        if (i15 == 2) {
                            uVar.G(i12);
                            int i19 = uVar.i();
                            int i20 = uVar.i();
                            uVar.G(i12);
                            int i21 = uVar.i();
                            switch (i21) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                android.gov.nist.core.a.v("Ignoring track with unsupported compression ", i21, "StreamFormatChunk");
                            } else {
                                r rVar = new r();
                                rVar.f42242p = i19;
                                rVar.f42243q = i20;
                                rVar.f42237k = str2;
                                gVar = new g(new C5065s(rVar));
                            }
                        } else if (i15 == 1) {
                            int n10 = uVar.n();
                            if (n10 == 1) {
                                str = "audio/raw";
                            } else if (n10 != 85) {
                                if (n10 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (n10 != 8192) {
                                    if (n10 != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                android.gov.nist.core.a.v("Ignoring track with unsupported format tag ", n10, "StreamFormatChunk");
                            } else {
                                int n11 = uVar.n();
                                int i22 = uVar.i();
                                uVar.G(6);
                                int t10 = AbstractC5530A.t(uVar.z());
                                int n12 = uVar.n();
                                byte[] bArr = new byte[n12];
                                uVar.e(bArr, i14, n12);
                                r rVar2 = new r();
                                rVar2.f42237k = str;
                                rVar2.f42250x = n11;
                                rVar2.f42251y = i22;
                                if ("audio/raw".equals(str) && t10 != 0) {
                                    rVar2.f42252z = t10;
                                }
                                if ("audio/mp4a-latm".equals(str) && n12 > 0) {
                                    rVar2.f42239m = N.u0(bArr);
                                }
                                gVar = new g(new C5065s(rVar2));
                            }
                        } else {
                            p.g("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC5530A.x(i15));
                        }
                        aVar = gVar;
                        break;
                    case 1751742049:
                        int i23 = uVar.i();
                        uVar.G(8);
                        int i24 = uVar.i();
                        int i25 = uVar.i();
                        uVar.G(i12);
                        uVar.i();
                        uVar.G(12);
                        aVar = new c(i23, i24, i25);
                        break;
                    case 1752331379:
                        int i26 = uVar.i();
                        uVar.G(12);
                        uVar.i();
                        int i27 = uVar.i();
                        int i28 = uVar.i();
                        uVar.G(i12);
                        int i29 = uVar.i();
                        int i30 = uVar.i();
                        uVar.G(8);
                        aVar = new d(i26, i27, i28, i29, i30);
                        break;
                    case 1852994675:
                        aVar = new h(uVar.s(uVar.a(), w8.e.f48221c));
                        break;
                    default:
                        aVar = gVar;
                        break;
                }
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    int i31 = ((d) aVar).f12662a;
                    if (i31 != 1935960438) {
                        if (i31 != 1935963489) {
                            if (i31 != 1937012852) {
                                p.g("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i31));
                                i11 = -1;
                            } else {
                                i11 = 3;
                            }
                            i15 = i11;
                        } else {
                            i15 = 1;
                        }
                    } else {
                        i15 = 2;
                    }
                }
                int i32 = i16 + 1;
                if (objArr.length < i32) {
                    objArr = Arrays.copyOf(objArr, r.f.x(objArr.length, i32));
                }
                objArr[i16] = aVar;
                i16 = i32;
            }
            uVar.F(i18);
            uVar.E(i13);
            i12 = 4;
            i14 = 0;
        }
        return new f(i10, N.T(i16, objArr));
    }

    public final a a(Class cls) {
        L listIterator = this.f12679a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // N2.a
    public final int getType() {
        return this.f12680b;
    }
}
