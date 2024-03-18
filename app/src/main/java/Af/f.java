package af;

import Lg.g;
import Xe.G;
import Xe.H;
import Ze.k;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.C4075s2;
import jh.EnumC4085u2;
import kf.C4270F;
import kf.t;
import l8.AbstractC4344b;
import livekit.LivekitModels$VideoLayer;
import livekit.org.webrtc.RtpParameters;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f24188a = {"q", "h", "f"};

    /* renamed from: b  reason: collision with root package name */
    public static final List f24189b = AbstractC4344b.G0(G.H90, G.H180, G.H216, G.H360, G.H540, G.H720, G.H1080, G.H1440, G.H2160);

    /* renamed from: c  reason: collision with root package name */
    public static final List f24190c = AbstractC4344b.G0(H.H120, H.H180, H.H240, H.H360, H.H480, H.H540, H.H720, H.H1080, H.H1440);

    public static List a(int i10, int i11) {
        float max = Math.max(i10, i11) / Math.min(i10, i11);
        if (Math.abs(max - 1.7777778f) < Math.abs(max - 1.3333334f)) {
            return f24189b;
        }
        return f24190c;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List b(int i10, int i11, List list, boolean z10) {
        EnumC4085u2 enumC4085u2;
        Integer num;
        int i12;
        AbstractC3557B.c0("encodings", list);
        boolean isEmpty = list.isEmpty();
        EnumC4085u2 enumC4085u22 = EnumC4085u2.HIGH;
        if (isEmpty) {
            C4075s2 newBuilder = LivekitModels$VideoLayer.newBuilder();
            newBuilder.d();
            LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder.f27507Z, i10);
            newBuilder.d();
            LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder.f27507Z, i11);
            newBuilder.d();
            LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder.f27507Z, enumC4085u22);
            newBuilder.d();
            LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder.f27507Z, 0);
            newBuilder.d();
            LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder.f27507Z, 0);
            return AbstractC4344b.F0(newBuilder.b());
        } else if (z10) {
            String str = ((RtpParameters.Encoding) t.f2(list)).scalabilityMode;
            AbstractC3557B.Z(str);
            k.Companion.getClass();
            g a5 = k.f23709d.a(str);
            if (a5 != null) {
                k kVar = new k(Integer.parseInt((String) ((C4270F) a5.a()).get(1)), Integer.parseInt((String) ((C4270F) a5.a()).get(2)), (String) ((C4270F) a5.a()).get(3));
                Integer num2 = ((RtpParameters.Encoding) t.f2(list)).maxBitrateBps;
                if (num2 == null) {
                    num2 = 0;
                }
                int intValue = num2.intValue();
                Cf.g D02 = N.D0(0, kVar.f23710a);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(D02, 10));
                Cf.f it = D02.iterator();
                while (it.f3111h0) {
                    int a10 = it.a();
                    C4075s2 newBuilder2 = LivekitModels$VideoLayer.newBuilder();
                    double d10 = 2.0f;
                    double d11 = a10;
                    int Y02 = AbstractC4344b.Y0((float) Math.ceil(i10 / ((float) Math.pow(d10, d11))));
                    newBuilder2.d();
                    LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder2.f27507Z, Y02);
                    int Y03 = AbstractC4344b.Y0((float) Math.ceil(i11 / ((float) Math.pow(d10, d11))));
                    newBuilder2.d();
                    LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder2.f27507Z, Y03);
                    EnumC4085u2 b10 = EnumC4085u2.b(enumC4085u22.a() - a10);
                    newBuilder2.d();
                    LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder2.f27507Z, b10);
                    int Y04 = AbstractC4344b.Y0((float) Math.ceil(intValue / ((float) Math.pow(3.0f, d11))));
                    newBuilder2.d();
                    LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder2.f27507Z, Y04);
                    newBuilder2.d();
                    LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder2.f27507Z, 0);
                    arrayList.add((LivekitModels$VideoLayer) newBuilder2.b());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("can't parse scalability mode: ".concat(str));
        } else {
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                RtpParameters.Encoding encoding = (RtpParameters.Encoding) it2.next();
                Double d12 = encoding.scaleResolutionDownBy;
                if (d12 == null) {
                    d12 = Double.valueOf(1.0d);
                }
                double doubleValue = d12.doubleValue();
                String str2 = encoding.rid;
                if (str2 == null) {
                    str2 = "";
                }
                int hashCode = str2.hashCode();
                EnumC4085u2 enumC4085u23 = EnumC4085u2.UNRECOGNIZED;
                if (hashCode != 102) {
                    if (hashCode != 104) {
                        if (hashCode == 113 && str2.equals("q")) {
                            enumC4085u2 = EnumC4085u2.LOW;
                            if (enumC4085u2 == enumC4085u23 && list.size() == 1) {
                                enumC4085u2 = enumC4085u22;
                            }
                            C4075s2 newBuilder3 = LivekitModels$VideoLayer.newBuilder();
                            newBuilder3.d();
                            LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder3.f27507Z, (int) (i10 / doubleValue));
                            newBuilder3.d();
                            LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder3.f27507Z, (int) (i11 / doubleValue));
                            newBuilder3.d();
                            LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder3.f27507Z, enumC4085u2);
                            num = encoding.maxBitrateBps;
                            if (num != null) {
                                i12 = 0;
                            } else {
                                i12 = num.intValue();
                            }
                            newBuilder3.d();
                            LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder3.f27507Z, i12);
                            newBuilder3.d();
                            LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder3.f27507Z, 0);
                            arrayList2.add((LivekitModels$VideoLayer) newBuilder3.b());
                        }
                        enumC4085u2 = enumC4085u23;
                        if (enumC4085u2 == enumC4085u23) {
                            enumC4085u2 = enumC4085u22;
                        }
                        C4075s2 newBuilder32 = LivekitModels$VideoLayer.newBuilder();
                        newBuilder32.d();
                        LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder32.f27507Z, (int) (i10 / doubleValue));
                        newBuilder32.d();
                        LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder32.f27507Z, (int) (i11 / doubleValue));
                        newBuilder32.d();
                        LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder32.f27507Z, enumC4085u2);
                        num = encoding.maxBitrateBps;
                        if (num != null) {
                        }
                        newBuilder32.d();
                        LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder32.f27507Z, i12);
                        newBuilder32.d();
                        LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder32.f27507Z, 0);
                        arrayList2.add((LivekitModels$VideoLayer) newBuilder32.b());
                    } else {
                        if (str2.equals("h")) {
                            enumC4085u2 = EnumC4085u2.MEDIUM;
                            if (enumC4085u2 == enumC4085u23) {
                            }
                            C4075s2 newBuilder322 = LivekitModels$VideoLayer.newBuilder();
                            newBuilder322.d();
                            LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder322.f27507Z, (int) (i10 / doubleValue));
                            newBuilder322.d();
                            LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder322.f27507Z, (int) (i11 / doubleValue));
                            newBuilder322.d();
                            LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder322.f27507Z, enumC4085u2);
                            num = encoding.maxBitrateBps;
                            if (num != null) {
                            }
                            newBuilder322.d();
                            LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder322.f27507Z, i12);
                            newBuilder322.d();
                            LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder322.f27507Z, 0);
                            arrayList2.add((LivekitModels$VideoLayer) newBuilder322.b());
                        }
                        enumC4085u2 = enumC4085u23;
                        if (enumC4085u2 == enumC4085u23) {
                        }
                        C4075s2 newBuilder3222 = LivekitModels$VideoLayer.newBuilder();
                        newBuilder3222.d();
                        LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder3222.f27507Z, (int) (i10 / doubleValue));
                        newBuilder3222.d();
                        LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder3222.f27507Z, (int) (i11 / doubleValue));
                        newBuilder3222.d();
                        LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder3222.f27507Z, enumC4085u2);
                        num = encoding.maxBitrateBps;
                        if (num != null) {
                        }
                        newBuilder3222.d();
                        LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder3222.f27507Z, i12);
                        newBuilder3222.d();
                        LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder3222.f27507Z, 0);
                        arrayList2.add((LivekitModels$VideoLayer) newBuilder3222.b());
                    }
                } else {
                    if (str2.equals("f")) {
                        enumC4085u2 = enumC4085u22;
                        if (enumC4085u2 == enumC4085u23) {
                        }
                        C4075s2 newBuilder32222 = LivekitModels$VideoLayer.newBuilder();
                        newBuilder32222.d();
                        LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder32222.f27507Z, (int) (i10 / doubleValue));
                        newBuilder32222.d();
                        LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder32222.f27507Z, (int) (i11 / doubleValue));
                        newBuilder32222.d();
                        LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder32222.f27507Z, enumC4085u2);
                        num = encoding.maxBitrateBps;
                        if (num != null) {
                        }
                        newBuilder32222.d();
                        LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder32222.f27507Z, i12);
                        newBuilder32222.d();
                        LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder32222.f27507Z, 0);
                        arrayList2.add((LivekitModels$VideoLayer) newBuilder32222.b());
                    }
                    enumC4085u2 = enumC4085u23;
                    if (enumC4085u2 == enumC4085u23) {
                    }
                    C4075s2 newBuilder322222 = LivekitModels$VideoLayer.newBuilder();
                    newBuilder322222.d();
                    LivekitModels$VideoLayer.access$18100((LivekitModels$VideoLayer) newBuilder322222.f27507Z, (int) (i10 / doubleValue));
                    newBuilder322222.d();
                    LivekitModels$VideoLayer.access$18300((LivekitModels$VideoLayer) newBuilder322222.f27507Z, (int) (i11 / doubleValue));
                    newBuilder322222.d();
                    LivekitModels$VideoLayer.access$17900((LivekitModels$VideoLayer) newBuilder322222.f27507Z, enumC4085u2);
                    num = encoding.maxBitrateBps;
                    if (num != null) {
                    }
                    newBuilder322222.d();
                    LivekitModels$VideoLayer.access$18500((LivekitModels$VideoLayer) newBuilder322222.f27507Z, i12);
                    newBuilder322222.d();
                    LivekitModels$VideoLayer.access$18700((LivekitModels$VideoLayer) newBuilder322222.f27507Z, 0);
                    arrayList2.add((LivekitModels$VideoLayer) newBuilder322222.b());
                }
            }
            return arrayList2;
        }
    }
}
