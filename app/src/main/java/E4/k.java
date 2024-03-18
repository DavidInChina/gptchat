package E4;

import D4.m;
import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.C3636c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q.C5241w;
import v4.C5971a;
import v4.l;
import w.C6066m;
import y4.p;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: C  reason: collision with root package name */
    public final StringBuilder f4504C = new StringBuilder(2);

    /* renamed from: D  reason: collision with root package name */
    public final RectF f4505D = new RectF();

    /* renamed from: E  reason: collision with root package name */
    public final Matrix f4506E = new Matrix();

    /* renamed from: F  reason: collision with root package name */
    public final i f4507F = new i(0);

    /* renamed from: G  reason: collision with root package name */
    public final i f4508G = new i(1);

    /* renamed from: H  reason: collision with root package name */
    public final HashMap f4509H = new HashMap();

    /* renamed from: I  reason: collision with root package name */
    public final C6066m f4510I = new C6066m((Object) null);

    /* renamed from: J  reason: collision with root package name */
    public final ArrayList f4511J = new ArrayList();

    /* renamed from: K  reason: collision with root package name */
    public final p f4512K;

    /* renamed from: L  reason: collision with root package name */
    public final l f4513L;

    /* renamed from: M  reason: collision with root package name */
    public final C5971a f4514M;

    /* renamed from: N  reason: collision with root package name */
    public final y4.e f4515N;

    /* renamed from: O  reason: collision with root package name */
    public final y4.e f4516O;
    public final y4.h P;
    public final y4.h Q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [y4.e, y4.p] */
    public k(l lVar, e eVar) {
        super(lVar, eVar);
        C4.b bVar;
        C4.b bVar2;
        C4.a aVar;
        C4.a aVar2;
        this.f4513L = lVar;
        this.f4514M = eVar.f4471b;
        ?? eVar2 = new y4.e(eVar.f4486q.f2681Z);
        this.f4512K = eVar2;
        eVar2.a(this);
        d(eVar2);
        U3.i iVar = eVar.f4487r;
        if (iVar != null && (aVar2 = (C4.a) iVar.f17414Y) != null) {
            y4.e s10 = aVar2.s();
            this.f4515N = s10;
            s10.a(this);
            d(s10);
        }
        if (iVar != null && (aVar = (C4.a) iVar.f17415Z) != null) {
            y4.e s11 = aVar.s();
            this.f4516O = s11;
            s11.a(this);
            d(s11);
        }
        if (iVar != null && (bVar2 = (C4.b) iVar.f17416h0) != null) {
            y4.e s12 = bVar2.s();
            this.P = (y4.h) s12;
            s12.a(this);
            d(s12);
        }
        if (iVar != null && (bVar = (C4.b) iVar.f17417i0) != null) {
            y4.e s13 = bVar.s();
            this.Q = (y4.h) s13;
            s13.a(this);
            d(s13);
        }
    }

    public static void p(String str, i iVar, Canvas canvas) {
        if (iVar.getColor() == 0) {
            return;
        }
        if (iVar.getStyle() == Paint.Style.STROKE && iVar.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, (Paint) iVar);
    }

    public static void q(Path path, i iVar, Canvas canvas) {
        if (iVar.getColor() == 0) {
            return;
        }
        if (iVar.getStyle() == Paint.Style.STROKE && iVar.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, iVar);
    }

    @Override // E4.b, x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        C5971a c5971a = this.f4514M;
        rectF.set(0.0f, 0.0f, c5971a.f47158k.width(), c5971a.f47158k.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0374  */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, q.w] */
    @Override // E4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        String str;
        B4.c cVar;
        Typeface typeface;
        float f6;
        List list;
        B4.c cVar2;
        int i12;
        String str2;
        String str3;
        Typeface typeface2;
        C5241w c5241w;
        int i13;
        float f10;
        String str4;
        int i14;
        List list2;
        String str5;
        float f11;
        List list3;
        B4.b bVar = (B4.b) this.f4512K.d();
        C5971a c5971a = this.f4514M;
        B4.c cVar3 = (B4.c) c5971a.f47153f.get(bVar.f1840b);
        if (cVar3 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        y4.e eVar = this.f4515N;
        i iVar = this.f4507F;
        if (eVar != null) {
            iVar.setColor(((Integer) eVar.d()).intValue());
        } else {
            iVar.setColor(bVar.f1846h);
        }
        y4.e eVar2 = this.f4516O;
        i iVar2 = this.f4508G;
        if (eVar2 != null) {
            iVar2.setColor(((Integer) eVar2.d()).intValue());
        } else {
            iVar2.setColor(bVar.f1847i);
        }
        y4.e eVar3 = this.f4455w.f50759j;
        if (eVar3 == null) {
            i11 = 100;
        } else {
            i11 = ((Integer) eVar3.d()).intValue();
        }
        int i15 = (((i11 * 255) / 100) * i10) / 255;
        iVar.setAlpha(i15);
        iVar2.setAlpha(i15);
        y4.h hVar = this.P;
        if (hVar != null) {
            iVar2.setStrokeWidth(((Float) hVar.d()).floatValue());
        } else {
            iVar2.setStrokeWidth(I4.g.c() * bVar.f1848j);
        }
        l lVar = this.f4513L;
        Map map = lVar.f47215m0;
        y4.h hVar2 = this.Q;
        String str6 = cVar3.f1854c;
        String str7 = cVar3.f1852a;
        if (map == null && lVar.f47208Y.f47155h.f() > 0) {
            I4.g.d(matrix);
            float f12 = bVar.f1841c / 100.0f;
            List asList = Arrays.asList(bVar.f1839a.replaceAll(Separators.NEWLINE, "\r").replaceAll("\u0003", "\r").replaceAll(Separators.RETURN, "\r").split("\r"));
            int size = asList.size();
            float f13 = bVar.f1843e / 10.0f;
            if (hVar2 != null) {
                f13 += ((Float) hVar2.d()).floatValue();
            }
            float f14 = f13;
            int i16 = 0;
            int i17 = -1;
            while (i16 < size) {
                String str8 = (String) asList.get(i16);
                PointF pointF = bVar.f1851m;
                if (pointF == null) {
                    f10 = 0.0f;
                } else {
                    f10 = pointF.x;
                }
                float f15 = f12;
                int i18 = i16;
                B4.c cVar4 = cVar3;
                int i19 = size;
                List list4 = asList;
                B4.c cVar5 = cVar3;
                String str9 = str7;
                List t10 = t(str8, f10, cVar4, f15, f14, true);
                int i20 = 0;
                while (i20 < t10.size()) {
                    j jVar = (j) t10.get(i20);
                    int i21 = i17 + 1;
                    canvas.save();
                    if (s(canvas, bVar, i21, jVar.f4503b)) {
                        String str10 = jVar.f4502a;
                        int i22 = 0;
                        while (i22 < str10.length()) {
                            B4.d dVar = (B4.d) c5971a.f47155h.c(B4.d.a(str10.charAt(i22), str9, str6));
                            if (dVar == null) {
                                f11 = f15;
                                list2 = t10;
                                str5 = str10;
                                i14 = i21;
                                str4 = str6;
                            } else {
                                HashMap hashMap = this.f4509H;
                                if (hashMap.containsKey(dVar)) {
                                    list3 = (List) hashMap.get(dVar);
                                    list2 = t10;
                                    str5 = str10;
                                    i14 = i21;
                                    str4 = str6;
                                } else {
                                    list2 = t10;
                                    List list5 = dVar.f1856a;
                                    str5 = str10;
                                    int size2 = list5.size();
                                    i14 = i21;
                                    ArrayList arrayList = new ArrayList(size2);
                                    str4 = str6;
                                    int i23 = 0;
                                    while (i23 < size2) {
                                        arrayList.add(new x4.d(lVar, this, (m) list5.get(i23), c5971a));
                                        i23++;
                                        size2 = size2;
                                        list5 = list5;
                                    }
                                    hashMap.put(dVar, arrayList);
                                    list3 = arrayList;
                                }
                                int i24 = 0;
                                while (i24 < list3.size()) {
                                    Path f16 = ((x4.d) list3.get(i24)).f();
                                    f16.computeBounds(this.f4505D, false);
                                    Matrix matrix2 = this.f4506E;
                                    matrix2.reset();
                                    List list6 = list3;
                                    matrix2.preTranslate(0.0f, (-bVar.f1845g) * I4.g.c());
                                    float f17 = f15;
                                    matrix2.preScale(f17, f17);
                                    f16.transform(matrix2);
                                    if (bVar.f1849k) {
                                        q(f16, iVar, canvas);
                                        q(f16, iVar2, canvas);
                                    } else {
                                        q(f16, iVar2, canvas);
                                        q(f16, iVar, canvas);
                                    }
                                    i24++;
                                    f15 = f17;
                                    list3 = list6;
                                }
                                f11 = f15;
                                canvas.translate((I4.g.c() * ((float) dVar.f1858c) * f11) + f14, 0.0f);
                            }
                            i22++;
                            f15 = f11;
                            str10 = str5;
                            t10 = list2;
                            i21 = i14;
                            str6 = str4;
                        }
                    }
                    canvas.restore();
                    i20++;
                    f15 = f15;
                    t10 = t10;
                    i17 = i21;
                    str6 = str6;
                }
                i16 = i18 + 1;
                f12 = f15;
                str7 = str9;
                size = i19;
                asList = list4;
                cVar3 = cVar5;
            }
        } else {
            Map map2 = lVar.f47215m0;
            if (map2 != null) {
                if (map2.containsKey(str7)) {
                    typeface = (Typeface) map2.get(str7);
                    str = Separators.RETURN;
                    cVar = cVar3;
                } else {
                    cVar = cVar3;
                    String str11 = cVar.f1853b;
                    if (map2.containsKey(str11)) {
                        typeface = (Typeface) map2.get(str11);
                    } else {
                        str3 = str6;
                        String j6 = android.gov.nist.core.a.j(str7, "-", str3);
                        if (map2.containsKey(j6)) {
                            typeface = (Typeface) map2.get(j6);
                        }
                    }
                    str = Separators.RETURN;
                }
                if (typeface == null) {
                    typeface = cVar.f1855d;
                }
                if (typeface != null) {
                    String str12 = bVar.f1839a;
                    iVar.setTypeface(typeface);
                    float f18 = bVar.f1841c;
                    iVar.setTextSize(I4.g.c() * f18);
                    iVar2.setTypeface(iVar.getTypeface());
                    iVar2.setTextSize(iVar.getTextSize());
                    float f19 = bVar.f1843e / 10.0f;
                    if (hVar2 != null) {
                        f19 += ((Float) hVar2.d()).floatValue();
                    }
                    float c10 = ((I4.g.c() * f19) * f18) / 100.0f;
                    List asList2 = Arrays.asList(str12.replaceAll(Separators.NEWLINE, "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                    int size3 = asList2.size();
                    int i25 = -1;
                    for (int i26 = 0; i26 < size3; i26++) {
                        String str13 = (String) asList2.get(i26);
                        PointF pointF2 = bVar.f1851m;
                        if (pointF2 == null) {
                            f6 = 0.0f;
                        } else {
                            f6 = pointF2.x;
                        }
                        List t11 = t(str13, f6, cVar, 0.0f, c10, false);
                        int i27 = 0;
                        while (i27 < t11.size()) {
                            j jVar2 = (j) t11.get(i27);
                            int i28 = i25 + 1;
                            canvas.save();
                            if (s(canvas, bVar, i28, jVar2.f4503b)) {
                                String str14 = jVar2.f4502a;
                                int i29 = 0;
                                while (i29 < str14.length()) {
                                    int codePointAt = str14.codePointAt(i29);
                                    List list7 = t11;
                                    int charCount = Character.charCount(codePointAt) + i29;
                                    int i30 = i28;
                                    while (true) {
                                        if (charCount < str14.length()) {
                                            int codePointAt2 = str14.codePointAt(charCount);
                                            list = asList2;
                                            cVar2 = cVar;
                                            if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                                                break;
                                            }
                                            charCount += Character.charCount(codePointAt2);
                                            codePointAt = (codePointAt * 31) + codePointAt2;
                                            asList2 = list;
                                            cVar = cVar2;
                                        } else {
                                            list = asList2;
                                            cVar2 = cVar;
                                            break;
                                        }
                                    }
                                    int i31 = size3;
                                    long j10 = codePointAt;
                                    C6066m c6066m = this.f4510I;
                                    if (c6066m.f(j10) >= 0) {
                                        str2 = (String) c6066m.d(j10);
                                        i12 = i31;
                                    } else {
                                        StringBuilder sb2 = this.f4504C;
                                        i12 = i31;
                                        sb2.setLength(0);
                                        int i32 = i29;
                                        while (i32 < charCount) {
                                            int i33 = charCount;
                                            int codePointAt3 = str14.codePointAt(i32);
                                            sb2.appendCodePoint(codePointAt3);
                                            i32 += Character.charCount(codePointAt3);
                                            charCount = i33;
                                        }
                                        str2 = sb2.toString();
                                        c6066m.h(j10, str2);
                                    }
                                    i29 += str2.length();
                                    if (bVar.f1849k) {
                                        p(str2, iVar, canvas);
                                        p(str2, iVar2, canvas);
                                    } else {
                                        p(str2, iVar2, canvas);
                                        p(str2, iVar, canvas);
                                    }
                                    canvas.translate(iVar.measureText(str2) + c10, 0.0f);
                                    t11 = list7;
                                    i28 = i30;
                                    asList2 = list;
                                    size3 = i12;
                                    cVar = cVar2;
                                }
                            }
                            canvas.restore();
                            i27++;
                            t11 = t11;
                            i25 = i28;
                            asList2 = asList2;
                            size3 = size3;
                            cVar = cVar;
                        }
                    }
                }
            } else {
                cVar = cVar3;
                str3 = str6;
            }
            if (lVar.getCallback() == null) {
                str = Separators.RETURN;
                c5241w = null;
                typeface2 = null;
            } else {
                if (lVar.f47214l0 == null) {
                    Drawable.Callback callback = lVar.getCallback();
                    ?? obj = new Object();
                    str = Separators.RETURN;
                    typeface2 = null;
                    obj.f43573a = new C3636c1(9, (AbstractC2469q0) null);
                    obj.f43574b = new HashMap();
                    obj.f43575c = new HashMap();
                    obj.f43578f = ".ttf";
                    obj.f43577e = null;
                    if (!(callback instanceof View)) {
                        I4.b.a("LottieDrawable must be inside of a view for images to work.");
                        obj.f43576d = null;
                    } else {
                        obj.f43576d = ((View) callback).getContext().getAssets();
                    }
                    lVar.f47214l0 = obj;
                } else {
                    str = Separators.RETURN;
                    typeface2 = null;
                }
                c5241w = lVar.f47214l0;
            }
            if (c5241w != null) {
                C3636c1 c3636c1 = (C3636c1) c5241w.f43573a;
                c3636c1.f34285Z = str7;
                c3636c1.f34286h0 = str3;
                typeface2 = (Typeface) ((Map) c5241w.f43574b).get(c3636c1);
                if (typeface2 == null) {
                    typeface2 = (Typeface) ((Map) c5241w.f43575c).get(str7);
                    if (typeface2 == null) {
                        AbstractC2469q0.p(c5241w.f43577e);
                        AbstractC2469q0.p(c5241w.f43577e);
                        typeface2 = cVar.f1855d;
                        if (typeface2 == null) {
                            typeface2 = Typeface.createFromAsset((AssetManager) c5241w.f43576d, "fonts/" + str7 + ((String) c5241w.f43578f));
                            ((Map) c5241w.f43575c).put(str7, typeface2);
                        }
                    }
                    boolean contains = str3.contains("Italic");
                    boolean contains2 = str3.contains("Bold");
                    if (contains && contains2) {
                        i13 = 3;
                    } else if (contains) {
                        i13 = 2;
                    } else if (contains2) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    if (typeface2.getStyle() != i13) {
                        typeface2 = Typeface.create(typeface2, i13);
                    }
                    ((Map) c5241w.f43574b).put((C3636c1) c5241w.f43573a, typeface2);
                }
            }
            typeface = typeface2;
            if (typeface == null) {
            }
            if (typeface != null) {
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, E4.j] */
    public final j r(int i10) {
        ArrayList arrayList = this.f4511J;
        for (int size = arrayList.size(); size < i10; size++) {
            ?? obj = new Object();
            obj.f4502a = "";
            obj.f4503b = 0.0f;
            arrayList.add(obj);
        }
        return (j) arrayList.get(i10 - 1);
    }

    public final boolean s(Canvas canvas, B4.b bVar, int i10, float f6) {
        float f10;
        float f11;
        PointF pointF = bVar.f1850l;
        PointF pointF2 = bVar.f1851m;
        float c10 = I4.g.c();
        float f12 = 0.0f;
        if (pointF == null) {
            f10 = 0.0f;
        } else {
            f10 = (bVar.f1844f * c10) + pointF.y;
        }
        float f13 = (i10 * bVar.f1844f * c10) + f10;
        if (this.f4513L.f47223u0 && pointF2 != null && pointF != null && f13 >= pointF.y + pointF2.y + bVar.f1841c) {
            return false;
        }
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = pointF.x;
        }
        if (pointF2 != null) {
            f12 = pointF2.x;
        }
        int f14 = AbstractC6708l.f(bVar.f1842d);
        if (f14 != 0) {
            if (f14 != 1) {
                if (f14 == 2) {
                    canvas.translate(((f12 / 2.0f) + f11) - (f6 / 2.0f), f13);
                }
            } else {
                canvas.translate((f11 + f12) - f6, f13);
            }
        } else {
            canvas.translate(f11, f13);
        }
        return true;
    }

    public final List t(String str, float f6, B4.c cVar, float f10, float f11, boolean z10) {
        float f12;
        String substring;
        String trim;
        String substring2;
        String trim2;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                B4.d dVar = (B4.d) this.f4514M.f47155h.c(B4.d.a(charAt, cVar.f1852a, cVar.f1854c));
                if (dVar != null) {
                    f12 = (I4.g.c() * ((float) dVar.f1858c) * f10) + f11;
                }
            } else {
                f12 = this.f4507F.measureText(str.substring(i13, i13 + 1)) + f11;
            }
            if (charAt == ' ') {
                z11 = true;
                f15 = f12;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f12;
            } else {
                f14 += f12;
            }
            f13 += f12;
            if (f6 > 0.0f && f13 >= f6 && charAt != ' ') {
                i10++;
                j r10 = r(i10);
                if (i12 == i11) {
                    r10.f4502a = str.substring(i11, i13).trim();
                    r10.f4503b = (f13 - f12) - ((trim2.length() - substring2.length()) * f15);
                    i11 = i13;
                    i12 = i11;
                    f13 = f12;
                    f14 = f13;
                } else {
                    r10.f4502a = str.substring(i11, i12 - 1).trim();
                    r10.f4503b = ((f13 - f14) - ((substring.length() - trim.length()) * f15)) - f15;
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            j r11 = r(i10);
            r11.f4502a = str.substring(i11);
            r11.f4503b = f13;
        }
        return this.f4511J.subList(0, i10);
    }
}
