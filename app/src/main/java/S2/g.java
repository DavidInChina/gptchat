package S2;

import java.io.StringReader;
import java.util.Arrays;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import p2.O;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f16108a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f16109b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f16110c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r7 == (-1)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(String str) {
        long j6;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (AbstractC4828h.W(newPullParser, "x:xmpmeta")) {
            L l10 = N.f49523Z;
            k0 k0Var = k0.f49573j0;
            long j10 = -9223372036854775807L;
            loop0: do {
                newPullParser.next();
                if (AbstractC4828h.W(newPullParser, "rdf:Description")) {
                    String[] strArr = f16108a;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 4) {
                            break loop0;
                        }
                        String K10 = AbstractC4828h.K(newPullParser, strArr[i11]);
                        if (K10 != null) {
                            if (Integer.parseInt(K10) == 1) {
                                String[] strArr2 = f16109b;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= 4) {
                                        break;
                                    }
                                    String K11 = AbstractC4828h.K(newPullParser, strArr2[i12]);
                                    if (K11 != null) {
                                        j6 = Long.parseLong(K11);
                                    } else {
                                        i12++;
                                    }
                                }
                                j6 = -9223372036854775807L;
                                String[] strArr3 = f16110c;
                                while (true) {
                                    if (i10 < 2) {
                                        String K12 = AbstractC4828h.K(newPullParser, strArr3[i10]);
                                        if (K12 != null) {
                                            k0Var = N.v0(new b("image/jpeg", 0L, 0L), new b("video/mp4", Long.parseLong(K12), 0L));
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        L l11 = N.f49523Z;
                                        k0Var = k0.f49573j0;
                                        break;
                                    }
                                }
                                j10 = j6;
                            }
                        } else {
                            i11++;
                        }
                    }
                    return null;
                } else if (AbstractC4828h.W(newPullParser, "Container:Directory")) {
                    k0Var = b(newPullParser, "Container", "Item");
                } else if (AbstractC4828h.W(newPullParser, "GContainer:Directory")) {
                    k0Var = b(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!AbstractC4828h.V(newPullParser, "x:xmpmeta"));
            if (k0Var.isEmpty()) {
                return null;
            }
            return new c(j10, k0Var);
        }
        throw O.a("Couldn't find xmp metadata", null);
    }

    public static k0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j6;
        long j10;
        L l10 = N.f49523Z;
        AbstractC4344b.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        boolean z10 = false;
        do {
            xmlPullParser.next();
            if (AbstractC4828h.W(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String K10 = AbstractC4828h.K(xmlPullParser, concat3);
                String K11 = AbstractC4828h.K(xmlPullParser, concat4);
                String K12 = AbstractC4828h.K(xmlPullParser, concat5);
                String K13 = AbstractC4828h.K(xmlPullParser, concat6);
                if (K10 != null && K11 != null) {
                    if (K12 != null) {
                        j6 = Long.parseLong(K12);
                    } else {
                        j6 = 0;
                    }
                    if (K13 != null) {
                        j10 = Long.parseLong(K13);
                    } else {
                        j10 = 0;
                    }
                    b bVar = new b(K10, j6, j10);
                    int i11 = i10 + 1;
                    if (objArr.length < i11) {
                        objArr = Arrays.copyOf(objArr, r.f.x(objArr.length, i11));
                    } else {
                        if (z10) {
                            objArr = (Object[]) objArr.clone();
                        }
                        objArr[i10] = bVar;
                        i10++;
                    }
                    z10 = false;
                    objArr[i10] = bVar;
                    i10++;
                } else {
                    return k0.f49573j0;
                }
            }
        } while (!AbstractC4828h.V(xmlPullParser, concat2));
        return N.T(i10, objArr);
    }
}
