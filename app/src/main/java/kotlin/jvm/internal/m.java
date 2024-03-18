package kotlin.jvm.internal;

import A.AbstractC0044t0;
import A.B0;
import A.C0043t;
import A.C0046u0;
import B.W0;
import Df.H;
import E.AbstractC0434s;
import E0.AbstractC0461u;
import G.U;
import G0.AbstractC0579h;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.C0595y;
import H.AbstractC0660i;
import H.C0659h;
import H.I;
import H0.AbstractC0696o0;
import H0.AbstractC0701r0;
import H0.T0;
import H0.U0;
import H0.Z;
import H0.h1;
import L.A0;
import L.AbstractC0844e;
import L.AbstractC0857k0;
import L.AbstractC0876w;
import L.C0840c;
import L.C0852i;
import L.C0859l0;
import L.C0863n0;
import L.C0877x;
import L.C0879z;
import L.E0;
import L.J;
import L.L0;
import L.N0;
import L.P;
import L.P0;
import L.Q0;
import L.R0;
import L.w0;
import L.x0;
import N.C1025i;
import N.K;
import N.r0;
import N.s0;
import N.t0;
import N.y0;
import N.z0;
import N0.C1044c;
import N0.C1046e;
import N0.C1049h;
import S0.C1341b;
import S0.C1343d;
import T0.C1409d;
import T0.G;
import W.C1586n;
import W.C1591o;
import W.C1610s;
import Z.AbstractC1700a0;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import Z.L;
import Z.O;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import h.AbstractC3285k;
import h.C3275a;
import h.C3278d;
import h.C3279e;
import h.C3281g;
import h.C3287m;
import h0.C3288a;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k6.AbstractC4194d;
import l0.AbstractC4325q;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import n0.AbstractC4705d;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import nf.AbstractC4831k;
import of.EnumC5000a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import pf.AbstractC5156c;
import q.A1;
import q.C1;
import q.X0;
import q0.C5251c;
import q0.C5252d;
import r0.AbstractC5350n;
import r0.C5341e;
import r0.N;
import s0.AbstractC5500b;
import s0.AbstractC5501c;
import s0.AbstractC5502d;
import s0.AbstractC5508j;
import s0.C5499a;
import s0.C5515q;
import s0.C5517s;
import u0.AbstractC5824b;
import u0.C5823a;
import v0.AbstractC5944H;
import v0.C5947K;
import v0.C5951d;
import v0.C5952e;
import w0.C6080a;
import wf.AbstractC6216a;
import x0.AbstractC6263a;
import y.AbstractC6463a;
import y.C6471i;
import y.C6475m;
import z.C6669J;
import z.C6672L;
import z.C6675O;
import z.C6686a;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f37642a = new Object[0];

    public static final void A(float[] fArr, float[] fArr2) {
        float f6 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f6);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f6);
        float f12 = fArr[2] * f6;
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + f12;
    }

    public static final float B(float[] fArr, float f6, float f10, float f11) {
        float f12 = fArr[0] * f6;
        return (fArr[6] * f11) + (fArr[3] * f10) + f12;
    }

    public static final float C(float[] fArr, float f6, float f10, float f11) {
        float f12 = fArr[1] * f6;
        return (fArr[7] * f11) + (fArr[4] * f10) + f12;
    }

    public static final float D(float[] fArr, float f6, float f10, float f11) {
        float f12 = fArr[2] * f6;
        return (fArr[8] * f11) + (fArr[5] * f10) + f12;
    }

    public static final void E(P0 p02, T0.z zVar, T0.s sVar) {
        int i10 = AbstractC3893i.f35891e;
        AbstractC3893i d10 = io.sentry.hints.i.d();
        try {
            AbstractC3893i j6 = d10.j();
            Q0 d11 = p02.d();
            if (d11 == null) {
                AbstractC3893i.p(j6);
                return;
            }
            T0.F f6 = p02.f10033e;
            if (f6 == null) {
                AbstractC3893i.p(j6);
                return;
            }
            AbstractC0461u c10 = p02.c();
            if (c10 == null) {
                AbstractC3893i.p(j6);
                return;
            }
            AbstractC0857k0.b(zVar, p02.f10029a, d11.f10054a, c10, f6, p02.b(), sVar);
            AbstractC3893i.p(j6);
        } finally {
            d10.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC5824b F(int i10, AbstractC1725n abstractC1725n) {
        AbstractC5824b abstractC5824b;
        boolean z10;
        boolean z11;
        boolean z12;
        long j6;
        int i11;
        int eventType;
        Z.r rVar;
        K0.c cVar;
        int i12;
        String str;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str3;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(473971343);
        Context context = (Context) rVar2.m(Z.f6888b);
        Resources q02 = H.q0(rVar2);
        rVar2.W(-492369756);
        Object K10 = rVar2.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (K10 == iVar) {
            K10 = new TypedValue();
            rVar2.h0(K10);
        }
        rVar2.t(false);
        TypedValue typedValue = (TypedValue) K10;
        int i19 = 1;
        q02.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        K0.b bVar = null;
        if (charSequence != null && Lg.n.e2(charSequence, ".xml")) {
            rVar2.W(-738265327);
            Resources.Theme theme = context.getTheme();
            int i20 = typedValue.changingConfigurations;
            rVar2.W(21855625);
            K0.d dVar = (K0.d) rVar2.m(Z.f6889c);
            K0.c cVar2 = new K0.c(i10, theme);
            WeakReference weakReference = (WeakReference) dVar.f9323a.get(cVar2);
            if (weakReference != null) {
                bVar = (K0.b) weakReference.get();
            }
            if (bVar == null) {
                XmlResourceParser xml = q02.getXml(i10);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next == 2) {
                    if (AbstractC3557B.K(xml.getName(), "vector")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        C6080a c6080a = new C6080a(xml);
                        TypedArray O02 = r9.y.O0(q02, theme, asAttributeSet, w0.b.f47649a);
                        c6080a.b(O02.getChangingConfigurations());
                        if (!r9.y.z0(xml, "autoMirrored")) {
                            z12 = false;
                        } else {
                            z12 = O02.getBoolean(5, false);
                        }
                        c6080a.b(O02.getChangingConfigurations());
                        float a5 = c6080a.a(O02, "viewportWidth", 7, 0.0f);
                        float a10 = c6080a.a(O02, "viewportHeight", 8, 0.0f);
                        if (a5 > 0.0f) {
                            if (a10 > 0.0f) {
                                float dimension = O02.getDimension(3, 0.0f);
                                c6080a.b(O02.getChangingConfigurations());
                                float dimension2 = O02.getDimension(2, 0.0f);
                                c6080a.b(O02.getChangingConfigurations());
                                if (O02.hasValue(1)) {
                                    TypedValue typedValue2 = new TypedValue();
                                    O02.getValue(1, typedValue2);
                                    if (typedValue2.type == 2) {
                                        j6 = r0.r.f44263k;
                                    } else {
                                        ColorStateList q03 = r9.y.q0(O02, xml, theme);
                                        c6080a.b(O02.getChangingConfigurations());
                                        if (q03 != null) {
                                            j6 = androidx.compose.ui.graphics.a.b(q03.getDefaultColor());
                                        } else {
                                            j6 = r0.r.f44263k;
                                        }
                                    }
                                } else {
                                    j6 = r0.r.f44263k;
                                }
                                int i21 = O02.getInt(6, -1);
                                c6080a.b(O02.getChangingConfigurations());
                                if (i21 != -1) {
                                    if (i21 != 3) {
                                        if (i21 != 5) {
                                            if (i21 != 9) {
                                                switch (i21) {
                                                    case 14:
                                                        i11 = 13;
                                                        break;
                                                    case 15:
                                                        i11 = 14;
                                                        break;
                                                    case 16:
                                                        i11 = 12;
                                                        break;
                                                }
                                            } else {
                                                i11 = 9;
                                            }
                                        }
                                    } else {
                                        i11 = 3;
                                    }
                                    O02.recycle();
                                    C5952e c5952e = new C5952e(null, dimension / q02.getDisplayMetrics().density, dimension2 / q02.getDisplayMetrics().density, a5, a10, j6, i11, z12, 1);
                                    int i22 = 0;
                                    for (int i23 = 3; xml.getEventType() != i19 && (xml.getDepth() >= i19 || xml.getEventType() != i23); i23 = 3) {
                                        XmlPullParser xmlPullParser = c6080a.f47647a;
                                        eventType = xmlPullParser.getEventType();
                                        if (eventType == 2) {
                                            if (eventType == i23 && AbstractC3557B.K("group", xmlPullParser.getName())) {
                                                int i24 = i22 + 1;
                                                for (int i25 = 0; i25 < i24; i25++) {
                                                    c5952e.d();
                                                }
                                                rVar = rVar2;
                                                cVar = cVar2;
                                                i12 = 1;
                                                i22 = 0;
                                                xml.next();
                                                i19 = i12;
                                                cVar2 = cVar;
                                                rVar2 = rVar;
                                            }
                                        } else {
                                            String name = xmlPullParser.getName();
                                            if (name != null) {
                                                int hashCode = name.hashCode();
                                                if (hashCode != -1649314686) {
                                                    rVar = rVar2;
                                                    if (hashCode != 3433509) {
                                                        if (hashCode == 98629247 && name.equals("group")) {
                                                            TypedArray O03 = r9.y.O0(q02, theme, asAttributeSet, w0.b.f47650b);
                                                            c6080a.b(O03.getChangingConfigurations());
                                                            float a11 = c6080a.a(O03, "rotation", 5, 0.0f);
                                                            float f6 = O03.getFloat(1, 0.0f);
                                                            c6080a.b(O03.getChangingConfigurations());
                                                            float f10 = O03.getFloat(2, 0.0f);
                                                            c6080a.b(O03.getChangingConfigurations());
                                                            float a12 = c6080a.a(O03, "scaleX", 3, 1.0f);
                                                            float a13 = c6080a.a(O03, "scaleY", 4, 1.0f);
                                                            float a14 = c6080a.a(O03, "translateX", 6, 0.0f);
                                                            float a15 = c6080a.a(O03, "translateY", 7, 0.0f);
                                                            String string = O03.getString(0);
                                                            c6080a.b(O03.getChangingConfigurations());
                                                            if (string == null) {
                                                                str3 = "";
                                                            } else {
                                                                str3 = string;
                                                            }
                                                            O03.recycle();
                                                            int i26 = AbstractC5944H.f46870a;
                                                            c5952e.a(str3, a11, f6, f10, a12, a13, a14, a15, kf.v.f37483Y);
                                                        }
                                                    } else if (name.equals("path")) {
                                                        TypedArray O04 = r9.y.O0(q02, theme, asAttributeSet, w0.b.f47651c);
                                                        c6080a.b(O04.getChangingConfigurations());
                                                        if (r9.y.z0(xmlPullParser, "pathData")) {
                                                            String string2 = O04.getString(0);
                                                            c6080a.b(O04.getChangingConfigurations());
                                                            if (string2 == null) {
                                                                str2 = "";
                                                            } else {
                                                                str2 = string2;
                                                            }
                                                            String string3 = O04.getString(2);
                                                            c6080a.b(O04.getChangingConfigurations());
                                                            List a16 = AbstractC5944H.a(string3);
                                                            C1025i r02 = r9.y.r0(O04, xmlPullParser, theme, "fillColor", 1);
                                                            c6080a.b(O04.getChangingConfigurations());
                                                            float a17 = c6080a.a(O04, "fillAlpha", 12, 1.0f);
                                                            if (!r9.y.z0(xmlPullParser, "strokeLineCap")) {
                                                                i13 = -1;
                                                            } else {
                                                                i13 = O04.getInt(8, -1);
                                                            }
                                                            c6080a.b(O04.getChangingConfigurations());
                                                            if (i13 != 0) {
                                                                if (i13 != 1) {
                                                                    if (i13 == 2) {
                                                                        i14 = 2;
                                                                    }
                                                                } else {
                                                                    i14 = 1;
                                                                }
                                                                if (r9.y.z0(xmlPullParser, "strokeLineJoin")) {
                                                                    i15 = -1;
                                                                } else {
                                                                    i15 = O04.getInt(9, -1);
                                                                }
                                                                c6080a.b(O04.getChangingConfigurations());
                                                                if (i15 == 0) {
                                                                    if (i15 != 1) {
                                                                        i16 = 2;
                                                                    } else {
                                                                        i16 = 1;
                                                                    }
                                                                } else {
                                                                    i16 = 0;
                                                                }
                                                                float a18 = c6080a.a(O04, "strokeMiterLimit", 10, 1.0f);
                                                                C1025i r03 = r9.y.r0(O04, xmlPullParser, theme, "strokeColor", 3);
                                                                c6080a.b(O04.getChangingConfigurations());
                                                                cVar = cVar2;
                                                                float a19 = c6080a.a(O04, "strokeAlpha", 11, 1.0f);
                                                                float a20 = c6080a.a(O04, "strokeWidth", 4, 1.0f);
                                                                float a21 = c6080a.a(O04, "trimPathEnd", 6, 1.0f);
                                                                float a22 = c6080a.a(O04, "trimPathOffset", 7, 0.0f);
                                                                float a23 = c6080a.a(O04, "trimPathStart", 5, 0.0f);
                                                                if (r9.y.z0(xmlPullParser, "fillType")) {
                                                                    i17 = 0;
                                                                } else {
                                                                    i17 = O04.getInt(13, 0);
                                                                }
                                                                c6080a.b(O04.getChangingConfigurations());
                                                                O04.recycle();
                                                                AbstractC5350n a24 = w0.b.a(r02);
                                                                AbstractC5350n a25 = w0.b.a(r03);
                                                                if (i17 != 0) {
                                                                    i18 = 0;
                                                                } else {
                                                                    i18 = 1;
                                                                }
                                                                c5952e.e();
                                                                ArrayList arrayList = c5952e.f46935i;
                                                                ((C5951d) arrayList.get(arrayList.size() - 1)).f46926j.add(new C5947K(str2, a16, i18, a24, a17, a25, a19, a20, i14, i16, a18, a23, a21, a22));
                                                            }
                                                            i14 = 0;
                                                            if (r9.y.z0(xmlPullParser, "strokeLineJoin")) {
                                                            }
                                                            c6080a.b(O04.getChangingConfigurations());
                                                            if (i15 == 0) {
                                                            }
                                                            float a182 = c6080a.a(O04, "strokeMiterLimit", 10, 1.0f);
                                                            C1025i r032 = r9.y.r0(O04, xmlPullParser, theme, "strokeColor", 3);
                                                            c6080a.b(O04.getChangingConfigurations());
                                                            cVar = cVar2;
                                                            float a192 = c6080a.a(O04, "strokeAlpha", 11, 1.0f);
                                                            float a202 = c6080a.a(O04, "strokeWidth", 4, 1.0f);
                                                            float a212 = c6080a.a(O04, "trimPathEnd", 6, 1.0f);
                                                            float a222 = c6080a.a(O04, "trimPathOffset", 7, 0.0f);
                                                            float a232 = c6080a.a(O04, "trimPathStart", 5, 0.0f);
                                                            if (r9.y.z0(xmlPullParser, "fillType")) {
                                                            }
                                                            c6080a.b(O04.getChangingConfigurations());
                                                            O04.recycle();
                                                            AbstractC5350n a242 = w0.b.a(r02);
                                                            AbstractC5350n a252 = w0.b.a(r032);
                                                            if (i17 != 0) {
                                                            }
                                                            c5952e.e();
                                                            ArrayList arrayList2 = c5952e.f46935i;
                                                            ((C5951d) arrayList2.get(arrayList2.size() - 1)).f46926j.add(new C5947K(str2, a16, i18, a242, a17, a252, a192, a202, i14, i16, a182, a232, a212, a222));
                                                        } else {
                                                            throw new IllegalArgumentException("No path data available");
                                                        }
                                                    }
                                                    cVar = cVar2;
                                                    i12 = 1;
                                                    xml.next();
                                                    i19 = i12;
                                                    cVar2 = cVar;
                                                    rVar2 = rVar;
                                                } else {
                                                    rVar = rVar2;
                                                    cVar = cVar2;
                                                    if (name.equals("clip-path")) {
                                                        TypedArray O05 = r9.y.O0(q02, theme, asAttributeSet, w0.b.f47652d);
                                                        c6080a.b(O05.getChangingConfigurations());
                                                        String string4 = O05.getString(0);
                                                        c6080a.b(O05.getChangingConfigurations());
                                                        if (string4 == null) {
                                                            str = "";
                                                        } else {
                                                            str = string4;
                                                        }
                                                        i12 = 1;
                                                        String string5 = O05.getString(1);
                                                        c6080a.b(O05.getChangingConfigurations());
                                                        List a26 = AbstractC5944H.a(string5);
                                                        O05.recycle();
                                                        c5952e.a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, a26);
                                                        i22++;
                                                        xml.next();
                                                        i19 = i12;
                                                        cVar2 = cVar;
                                                        rVar2 = rVar;
                                                    }
                                                }
                                                i12 = 1;
                                                xml.next();
                                                i19 = i12;
                                                cVar2 = cVar;
                                                rVar2 = rVar;
                                            }
                                        }
                                        rVar = rVar2;
                                        cVar = cVar2;
                                        i12 = 1;
                                        xml.next();
                                        i19 = i12;
                                        cVar2 = cVar;
                                        rVar2 = rVar;
                                    }
                                    Z.r rVar3 = rVar2;
                                    K0.c cVar3 = cVar2;
                                    bVar = new K0.b(c5952e.c(), i20);
                                    dVar.f9323a.put(cVar3, new WeakReference(bVar));
                                    rVar2 = rVar3;
                                    z11 = false;
                                }
                                i11 = 5;
                                O02.recycle();
                                C5952e c5952e2 = new C5952e(null, dimension / q02.getDisplayMetrics().density, dimension2 / q02.getDisplayMetrics().density, a5, a10, j6, i11, z12, 1);
                                int i222 = 0;
                                while (xml.getEventType() != i19) {
                                    XmlPullParser xmlPullParser2 = c6080a.f47647a;
                                    eventType = xmlPullParser2.getEventType();
                                    if (eventType == 2) {
                                    }
                                    rVar = rVar2;
                                    cVar = cVar2;
                                    i12 = 1;
                                    xml.next();
                                    i19 = i12;
                                    cVar2 = cVar;
                                    rVar2 = rVar;
                                }
                                Z.r rVar32 = rVar2;
                                K0.c cVar32 = cVar2;
                                bVar = new K0.b(c5952e2.c(), i20);
                                dVar.f9323a.put(cVar32, new WeakReference(bVar));
                                rVar2 = rVar32;
                                z11 = false;
                            } else {
                                throw new XmlPullParserException(O02.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                            }
                        } else {
                            throw new XmlPullParserException(O02.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                        }
                    } else {
                        throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } else {
                z11 = false;
            }
            rVar2.t(z11);
            abstractC5824b = R4.b.R1(bVar.f9319a, rVar2);
            rVar2.t(z11);
            z10 = false;
        } else {
            rVar2.W(-738265172);
            Integer valueOf = Integer.valueOf(i10);
            Resources.Theme theme2 = context.getTheme();
            rVar2.W(1618982084);
            boolean g10 = rVar2.g(theme2) | rVar2.g(valueOf) | rVar2.g(charSequence);
            Object K11 = rVar2.K();
            if (g10 || K11 == iVar) {
                try {
                    Drawable drawable = q02.getDrawable(i10, null);
                    AbstractC3557B.a0("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable", drawable);
                    K11 = new C5341e(((BitmapDrawable) drawable).getBitmap());
                    rVar2.h0(K11);
                } catch (Exception e10) {
                    throw new RuntimeException("Error attempting to load resource: " + ((Object) charSequence), e10);
                }
            }
            rVar2.t(false);
            r0.z zVar = (r0.z) K11;
            C5341e c5341e = (C5341e) zVar;
            abstractC5824b = new C5823a(zVar, Z0.i.f22797b, Ng.H.c(c5341e.f44234a.getWidth(), c5341e.f44234a.getHeight()));
            z10 = false;
            rVar2.t(false);
        }
        rVar2.t(z10);
        return abstractC5824b;
    }

    public static final C3287m G(P4.a aVar, wf.k kVar, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1408504823);
        AbstractC4828h.g0(aVar, rVar);
        AbstractC1710f0 g02 = AbstractC4828h.g0(kVar, rVar);
        Context context = null;
        String str = (String) Ad.l.Y0(new Object[0], null, C3279e.f31656Z, rVar, 6);
        O o10 = AbstractC3285k.f31674a;
        rVar.W(1418020823);
        j.i iVar = (j.i) rVar.m(AbstractC3285k.f31674a);
        if (iVar == null) {
            Context context2 = (Context) rVar.m(Z.f6888b);
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof j.i) {
                    context = context2;
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            iVar = context;
        }
        rVar.t(false);
        if (iVar != null) {
            j.h d10 = iVar.d();
            rVar.W(-3687241);
            Object K10 = rVar.K();
            io.sentry.hints.i iVar2 = C1723m.f22654Y;
            if (K10 == iVar2) {
                K10 = new Object();
                rVar.h0(K10);
            }
            rVar.t(false);
            C3275a c3275a = (C3275a) K10;
            rVar.W(-3687241);
            Object K11 = rVar.K();
            if (K11 == iVar2) {
                K11 = new C3287m(c3275a);
                rVar.h0(K11);
            }
            rVar.t(false);
            C3287m c3287m = (C3287m) K11;
            C3278d c3278d = new C3278d(c3275a, d10, str, aVar, g02, 0);
            rVar.W(-1239538271);
            rVar.W(1618982084);
            boolean g10 = rVar.g(aVar) | rVar.g(str) | rVar.g(d10);
            Object K12 = rVar.K();
            if (g10 || K12 == iVar2) {
                rVar.h0(new L(c3278d));
            }
            AbstractC6463a.u(rVar, false, false, false);
            return c3287m;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }

    public static final i0.j H(AbstractC1725n abstractC1725n) {
        i0.r rVar;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(15454635);
        Object[] objArr = new Object[0];
        switch (i0.j.f32419d.f29664Y) {
            case 14:
                rVar = I.f6576F;
                break;
            default:
                rVar = i0.j.f32420e;
                break;
        }
        i0.j jVar = (i0.j) Ad.l.Y0(objArr, rVar, i0.k.f32424Z, rVar2, 4);
        jVar.f32423c = (i0.m) rVar2.m(i0.p.f32433a);
        rVar2.t(false);
        return jVar;
    }

    public static void I(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            A1.a(view, charSequence);
            return;
        }
        C1 c12 = C1.f43237p0;
        if (c12 != null && c12.f43239Y == view) {
            C1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C1 c13 = C1.f43238q0;
            if (c13 != null && c13.f43239Y == view) {
                c13.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C1(view, charSequence);
    }

    public static final Object[] J(Collection collection) {
        AbstractC3557B.c0("collection", collection);
        int size = collection.size();
        Object[] objArr = f37642a;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i12 = ((i11 * 3) + 1) >>> 1;
                            if (i12 <= i11) {
                                i12 = 2147483645;
                                if (i11 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i12);
                            AbstractC3557B.b0("copyOf(...)", objArr2);
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        AbstractC3557B.b0("copyOf(...)", copyOf);
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] K(Collection collection, Object[] objArr) {
        Object[] objArr2;
        AbstractC3557B.c0("collection", collection);
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", newInstance);
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                AbstractC3557B.b0("copyOf(...)", objArr2);
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                AbstractC3557B.b0("copyOf(...)", copyOf);
                return copyOf;
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:316:0x05e4, code lost:
        if (r4 > ((r6 != null ? r6.longValue() : 0) + 5000)) goto L318;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0794 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(T0.z zVar, wf.k kVar, AbstractC4326r abstractC4326r, N0.E e10, T0.I i10, wf.k kVar2, D.m mVar, AbstractC5350n abstractC5350n, boolean z10, int i11, int i12, T0.o oVar, C0863n0 c0863n0, boolean z11, boolean z12, wf.o oVar2, AbstractC1725n abstractC1725n, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        wf.o oVar3;
        boolean z13;
        boolean z14;
        C0863n0 c0863n02;
        T0.o oVar4;
        int i31;
        int i32;
        boolean z15;
        AbstractC5350n abstractC5350n2;
        D.m mVar2;
        wf.k kVar3;
        T0.I i33;
        N0.E e11;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        C3288a c3288a;
        boolean z16;
        int i34;
        AbstractC5350n abstractC5350n3;
        wf.k kVar4;
        AbstractC4326r abstractC4326r3;
        N0.E e12;
        T0.I i35;
        D.m mVar3;
        boolean z17;
        int i36;
        T0.o oVar5;
        C0863n0 c0863n03;
        boolean z18;
        Object K10;
        io.sentry.hints.i iVar;
        W0 w02;
        boolean g10;
        Object K11;
        boolean g11;
        Object K12;
        N0.D d10;
        N0 n02;
        T0.I i37;
        C1741v0 z19;
        boolean z20;
        boolean z21;
        boolean z22;
        N0.D d11;
        boolean z23;
        T0.z zVar2;
        Object K13;
        R0 r02;
        Object K14;
        t0 t0Var;
        Object K15;
        Object w10;
        AbstractC4326r abstractC4326r4;
        p0.f fVar;
        N0.E e13;
        boolean z24;
        AbstractC4326r abstractC4326r5;
        AbstractC5350n abstractC5350n4;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-958708118);
        int i38 = 2;
        if ((i15 & 1) != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i16 = i13 | (rVar2.g(zVar) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i13 & 112) == 0) {
            i16 |= rVar2.i(kVar) ? 32 : 16;
        }
        int i39 = i16;
        int i40 = i15 & 4;
        if (i40 != 0) {
            i39 |= 384;
        } else if ((i13 & 896) == 0) {
            i39 |= rVar2.g(abstractC4326r) ? 256 : 128;
            i17 = i15 & 8;
            if (i17 == 0) {
                i39 |= 3072;
            } else if ((i13 & 7168) == 0) {
                i39 |= rVar2.g(e10) ? 2048 : 1024;
                i18 = i15 & 16;
                if (i18 != 0) {
                    i39 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    i39 |= rVar2.g(i10) ? 16384 : 8192;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    i39 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    i39 |= rVar2.i(kVar2) ? 131072 : 65536;
                }
                i20 = i15 & 64;
                if (i20 != 0) {
                    i39 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    i39 |= rVar2.g(mVar) ? 1048576 : 524288;
                }
                i21 = i15 & 128;
                if (i21 != 0) {
                    i39 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    i39 |= rVar2.g(abstractC5350n) ? 8388608 : 4194304;
                }
                i22 = i15 & 256;
                if (i22 != 0) {
                    i39 |= 100663296;
                } else if ((i13 & 234881024) == 0) {
                    i39 |= rVar2.h(z10) ? 67108864 : 33554432;
                }
                i23 = i15 & 512;
                if (i23 == 0) {
                    if ((i13 & 1879048192) == 0) {
                        i24 = rVar2.e(i11) ? 536870912 : 268435456;
                    }
                    i25 = i15 & 1024;
                    if (i25 == 0) {
                        i26 = i14 | 6;
                    } else if ((i14 & 14) == 0) {
                        if (rVar2.e(i12)) {
                            i38 = 4;
                        }
                        i26 = i14 | i38;
                    } else {
                        i26 = i14;
                    }
                    if ((i14 & 112) == 0) {
                        i26 |= ((i15 & 2048) != 0 || !rVar2.g(oVar)) ? 16 : 32;
                    }
                    int i41 = i26;
                    i27 = i15 & 4096;
                    if (i27 == 0) {
                        i41 |= 384;
                    } else if ((i14 & 896) == 0) {
                        i41 |= rVar2.g(c0863n0) ? 256 : 128;
                    }
                    i28 = i15 & 8192;
                    if (i28 == 0) {
                        i41 |= 3072;
                    } else if ((i14 & 7168) == 0) {
                        i41 |= rVar2.h(z11) ? 2048 : 1024;
                    }
                    i29 = i15 & 16384;
                    if (i29 == 0) {
                        i41 |= 24576;
                    } else if ((i14 & 57344) == 0) {
                        i41 |= rVar2.h(z12) ? 16384 : 8192;
                    }
                    i30 = i15 & 32768;
                    if (i30 == 0) {
                        i41 |= 196608;
                    } else if ((i14 & 458752) == 0) {
                        i41 |= rVar2.i(oVar2) ? 131072 : 65536;
                    }
                    if ((i39 & 1533916891) != 306783378 && (i41 & 374491) == 74898 && rVar2.B()) {
                        rVar2.P();
                        abstractC4326r2 = abstractC4326r;
                        e11 = e10;
                        i33 = i10;
                        kVar3 = kVar2;
                        mVar2 = mVar;
                        abstractC5350n2 = abstractC5350n;
                        z15 = z10;
                        i32 = i11;
                        i31 = i12;
                        oVar4 = oVar;
                        c0863n02 = c0863n0;
                        z14 = z11;
                        z13 = z12;
                        oVar3 = oVar2;
                        rVar = rVar2;
                    } else {
                        rVar2.R();
                        if ((i13 & 1) == 0 && !rVar2.A()) {
                            rVar2.P();
                            abstractC4326r3 = abstractC4326r;
                            e12 = e10;
                            i35 = i10;
                            kVar4 = kVar2;
                            mVar3 = mVar;
                            abstractC5350n3 = abstractC5350n;
                            z17 = z10;
                            i36 = i11;
                            i34 = i12;
                            oVar5 = oVar;
                            c0863n03 = c0863n0;
                            z18 = z11;
                            z16 = z12;
                            c3288a = oVar2;
                        } else {
                            AbstractC4326r abstractC4326r6 = i40 == 0 ? C4323o.f37719b : abstractC4326r;
                            N0.E e14 = i17 == 0 ? N0.E.f12486d : e10;
                            T0.I i42 = i18 == 0 ? T0.H.f16758a : i10;
                            wf.k kVar5 = i19 == 0 ? C0877x.f10350Y : kVar2;
                            D.m mVar4 = i20 == 0 ? null : mVar;
                            if (i21 == 0) {
                                abstractC4326r5 = abstractC4326r6;
                                abstractC5350n4 = new N(r0.r.f44263k);
                            } else {
                                abstractC4326r5 = abstractC4326r6;
                                abstractC5350n4 = abstractC5350n;
                            }
                            boolean z25 = i22 == 0 ? true : z10;
                            int i43 = i23 == 0 ? Integer.MAX_VALUE : i11;
                            int i44 = i25 == 0 ? 1 : i12;
                            T0.o oVar6 = (2048 & i15) == 0 ? T0.o.f16802f : oVar;
                            C0863n0 c0863n04 = i27 == 0 ? C0863n0.f10236g : c0863n0;
                            boolean z26 = i28 == 0 ? true : z11;
                            boolean z27 = i29 == 0 ? false : z12;
                            if (i30 == 0) {
                                i34 = i44;
                                oVar5 = oVar6;
                                z16 = z27;
                                c3288a = AbstractC0876w.f10338a;
                            } else {
                                c3288a = oVar2;
                                i34 = i44;
                                oVar5 = oVar6;
                                z16 = z27;
                            }
                            abstractC5350n3 = abstractC5350n4;
                            e12 = e14;
                            i35 = i42;
                            mVar3 = mVar4;
                            abstractC4326r3 = abstractC4326r5;
                            i36 = i43;
                            kVar4 = kVar5;
                            boolean z28 = z25;
                            c0863n03 = c0863n04;
                            z18 = z26;
                            z17 = z28;
                        }
                        rVar2.u();
                        rVar2.W(-492369756);
                        K10 = rVar2.K();
                        iVar = C1723m.f22654Y;
                        if (K10 == iVar) {
                            K10 = new p0.l();
                            rVar2.h0(K10);
                        }
                        rVar2.t(false);
                        p0.l lVar = (p0.l) K10;
                        T0.A a5 = (T0.A) rVar2.m(AbstractC0701r0.f7009l);
                        Z0.b bVar = (Z0.b) rVar2.m(AbstractC0701r0.f7002e);
                        AbstractC4326r abstractC4326r7 = abstractC4326r3;
                        S0.r rVar3 = (S0.r) rVar2.m(AbstractC0701r0.f7005h);
                        D.m mVar5 = mVar3;
                        boolean z29 = z18;
                        long j6 = ((y0) rVar2.m(z0.f12460a)).f12456b;
                        p0.f fVar2 = (p0.f) rVar2.m(AbstractC0701r0.f7003f);
                        h1 h1Var = (h1) rVar2.m(AbstractC0701r0.f7014q);
                        T0 t02 = (T0) rVar2.m(AbstractC0701r0.f7010m);
                        w02 = (i36 == 1 || z17 || !oVar5.f16803a) ? W0.f1213Y : W0.f1214Z;
                        T0.o oVar7 = oVar5;
                        int i45 = i36;
                        Object[] objArr = {w02};
                        i0.r rVar4 = N0.f10004f;
                        C0863n0 c0863n05 = c0863n03;
                        rVar2.W(-272912543);
                        g10 = rVar2.g(w02);
                        K11 = rVar2.K();
                        if (!g10 || K11 == iVar) {
                            K11 = new C6672L(6, w02);
                            rVar2.h0(K11);
                        }
                        rVar2.t(false);
                        N0 n03 = (N0) Ad.l.Y0(objArr, rVar4, (AbstractC6216a) K11, rVar2, 4);
                        rVar2.W(511388516);
                        g11 = rVar2.g(zVar) | rVar2.g(i35);
                        K12 = rVar2.K();
                        if (!g11 || K12 == iVar) {
                            G a10 = AbstractC0857k0.a(i35, zVar.f16830a);
                            d10 = zVar.f16832c;
                            if (d10 == null) {
                                int i46 = N0.D.f12484c;
                                long j10 = d10.f12485a;
                                n02 = n03;
                                i37 = i35;
                                int b10 = a10.f16757b.b((int) (j10 >> 32));
                                T0.s sVar = a10.f16757b;
                                int b11 = sVar.b((int) (j10 & 4294967295L));
                                int min = Math.min(b10, b11);
                                int max = Math.max(b10, b11);
                                C1044c c1044c = new C1044c(a10.f16756a);
                                c1044c.a(new N0.y(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, Y0.j.f22032c, null, 61439), min, max);
                                K12 = new G(c1044c.i(), sVar);
                            } else {
                                n02 = n03;
                                i37 = i35;
                                K12 = a10;
                            }
                            rVar2.h0(K12);
                        } else {
                            n02 = n03;
                            i37 = i35;
                        }
                        rVar2.t(false);
                        G g12 = (G) K12;
                        C1046e c1046e = g12.f16756a;
                        z19 = rVar2.z();
                        if (z19 == null) {
                            z19.f22736a |= 1;
                            rVar2.W(1157296644);
                            boolean g13 = rVar2.g(t02);
                            Object K16 = rVar2.K();
                            if (g13 || K16 == iVar) {
                                K16 = new P0(new w0(c1046e, e12, Integer.MAX_VALUE, 1, z17, 1, bVar, rVar3, kf.v.f37483Y), z19, t02);
                                rVar2.h0(K16);
                            }
                            rVar2.t(false);
                            P0 p02 = (P0) K16;
                            C1046e c1046e2 = zVar.f16830a;
                            p02.f10047s = kVar;
                            p02.f10050v.f(j6);
                            C0859l0 c0859l0 = p02.f10046r;
                            c0859l0.f10230b = c0863n05;
                            c0859l0.f10231c = fVar2;
                            p02.f10038j = c1046e2;
                            w0 w0Var = p02.f10029a;
                            kf.v vVar = kf.v.f37483Y;
                            if (!AbstractC3557B.K(w0Var.f10339a, c1046e) || !AbstractC3557B.K(w0Var.f10340b, e12) || w0Var.f10343e != z17 || !AbstractC3557B.D0(w0Var.f10344f, 1) || w0Var.f10341c != Integer.MAX_VALUE || w0Var.f10342d != 1 || !AbstractC3557B.K(w0Var.f10345g, bVar) || !AbstractC3557B.K(w0Var.f10347i, vVar) || w0Var.f10346h != rVar3) {
                                w0Var = new w0(c1046e, e12, Integer.MAX_VALUE, 1, z17, 1, bVar, rVar3, vVar);
                            }
                            if (p02.f10029a != w0Var) {
                                p02.f10044p = true;
                            }
                            p02.f10029a = w0Var;
                            T0.F f6 = p02.f10033e;
                            T0.j jVar = p02.f10032d;
                            jVar.getClass();
                            boolean z30 = !AbstractC3557B.K(zVar.f16832c, jVar.f16790b.c());
                            C1046e c1046e3 = jVar.f16789a.f16830a;
                            C1046e c1046e4 = zVar.f16830a;
                            boolean K17 = AbstractC3557B.K(c1046e3, c1046e4);
                            long j11 = zVar.f16831b;
                            if (!K17) {
                                jVar.f16790b = new T0.k(c1046e4, j11);
                                z20 = z17;
                                z22 = true;
                            } else {
                                z20 = z17;
                                if (!N0.D.a(jVar.f16789a.f16831b, j11)) {
                                    jVar.f16790b.f(N0.D.e(j11), N0.D.d(j11));
                                    z22 = false;
                                    z21 = true;
                                    d11 = zVar.f16832c;
                                    if (d11 != null) {
                                        T0.k kVar6 = jVar.f16790b;
                                        kVar6.f16794d = -1;
                                        kVar6.f16795e = -1;
                                    } else {
                                        long j12 = d11.f12485a;
                                        if (!N0.D.b(j12)) {
                                            z23 = z20;
                                            jVar.f16790b.e(N0.D.e(j12), N0.D.d(j12));
                                            if (z22 && (z21 || !z30)) {
                                                zVar2 = zVar;
                                            } else {
                                                T0.k kVar7 = jVar.f16790b;
                                                kVar7.f16794d = -1;
                                                kVar7.f16795e = -1;
                                                zVar2 = T0.z.a(zVar, null, 0L, 3);
                                            }
                                            T0.z zVar3 = jVar.f16789a;
                                            jVar.f16789a = zVar2;
                                            if (f6 != null) {
                                                f6.a(zVar3, zVar2);
                                            }
                                            rVar2.W(-492369756);
                                            K13 = rVar2.K();
                                            if (K13 == iVar) {
                                                K13 = new R0();
                                                rVar2.h0(K13);
                                            }
                                            rVar2.t(false);
                                            r02 = (R0) K13;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (!r02.f10062f) {
                                                Long l10 = r02.f10061e;
                                            }
                                            r02.f10061e = Long.valueOf(currentTimeMillis);
                                            r02.a(zVar);
                                            rVar2.W(-492369756);
                                            K14 = rVar2.K();
                                            if (K14 == iVar) {
                                                K14 = new t0(r02);
                                                rVar2.h0(K14);
                                            }
                                            rVar2.t(false);
                                            t0Var = (t0) K14;
                                            T0.s sVar2 = g12.f16757b;
                                            t0Var.f12414b = sVar2;
                                            t0Var.f12415c = p02.f10048t;
                                            t0Var.f12416d = p02;
                                            t0Var.f12417e.setValue(zVar);
                                            t0Var.f12418f = (AbstractC0696o0) rVar2.m(AbstractC0701r0.f7001d);
                                            t0Var.f12419g = (U0) rVar2.m(AbstractC0701r0.f7011n);
                                            t0Var.f12420h = (AbstractC6263a) rVar2.m(AbstractC0701r0.f7006i);
                                            t0Var.f12421i = lVar;
                                            boolean z31 = !z16;
                                            t0Var.f12422j.setValue(Boolean.valueOf(z31));
                                            rVar2.W(773894976);
                                            rVar2.W(-492369756);
                                            K15 = rVar2.K();
                                            if (K15 == iVar) {
                                                Z.C c10 = new Z.C(AbstractC1734s.k(rVar2));
                                                rVar2.h0(c10);
                                                K15 = c10;
                                            }
                                            rVar2.t(false);
                                            Ng.F f10 = ((Z.C) K15).f22442Y;
                                            w10 = AbstractC0044t0.w(rVar2, false, -492369756);
                                            if (w10 == iVar) {
                                                w10 = new I.f();
                                                rVar2.h0(w10);
                                            }
                                            rVar2.t(false);
                                            I.f fVar3 = (I.f) w10;
                                            abstractC4326r4 = C4323o.f37719b;
                                            AbstractC4326r a11 = androidx.compose.foundation.b.a(mVar5, androidx.compose.ui.focus.a.v(androidx.compose.ui.focus.a.j(abstractC4326r4, lVar), new L.I(p02, a5, z29, z16, zVar, oVar7, sVar2, t0Var, f10, fVar3)), z29);
                                            rVar2.W(-55007276);
                                            if (a5 != null) {
                                                e13 = e12;
                                                fVar = fVar2;
                                                AbstractC1734s.e(jf.y.f36177a, new C0879z(p02, AbstractC4828h.g0(Boolean.valueOf(z29 && !z16), rVar2), a5, t0Var, oVar7, sVar2, null), rVar2);
                                            } else {
                                                fVar = fVar2;
                                                e13 = e12;
                                            }
                                            rVar2.t(false);
                                            AbstractC4326r a12 = B0.I.a(abstractC4326r4, 8675309, new N.N(new L.G(p02, 1), null));
                                            J j13 = new J(p02, lVar, z16, t0Var, sVar2);
                                            if (z29) {
                                                a12 = U3.f.o(a12, new C0046u0(j13, 1, mVar5));
                                            }
                                            s0 s0Var = t0Var.f12432t;
                                            r0 r0Var = t0Var.f12431s;
                                            AbstractC4326r g14 = a12.g(new SuspendPointerInputElement(s0Var, r0Var, new K(s0Var, r0Var, null), 4)).g(new PointerHoverIconModifierElement(false));
                                            AbstractC4326r d12 = androidx.compose.ui.draw.a.d(abstractC4326r4, new C3281g(p02, zVar, sVar2, 12));
                                            AbstractC4326r j14 = androidx.compose.ui.layout.a.j(abstractC4326r4, new A.A(p02, z29, h1Var, t0Var, zVar, sVar2, 3));
                                            AbstractC4326r a13 = L0.l.a(abstractC4326r4, true, new L.O(g12, zVar, z29, oVar7, z16, p02, sVar2, t0Var, lVar));
                                            boolean z32 = !z29 && !z16;
                                            C6669J c6669j = A0.f9856a;
                                            AbstractC4326r o10 = z32 ? U3.f.o(abstractC4326r4, new C6475m(abstractC5350n3, p02, zVar, sVar2, 2)) : abstractC4326r4;
                                            AbstractC1734s.b(t0Var, new L.A(t0Var, 0), rVar2);
                                            AbstractC1734s.b(oVar7, new C6686a(a5, p02, zVar, oVar7, 4), rVar2);
                                            AbstractC4326r o11 = U3.f.o(abstractC4326r4, new E0(p02, t0Var, zVar, z31, i45 == 1, sVar2, r02, p02.f10048t, oVar7.f16807e));
                                            N0 n04 = n02;
                                            AbstractC4326r j15 = androidx.compose.ui.layout.a.j(U3.f.o(androidx.compose.ui.input.key.a.e(androidx.compose.ui.input.key.a.e(abstractC4326r7.g(a11), new C0043t(fVar, 8, p02)), new C0043t(p02, 7, t0Var)).g(o11), new L0(n04, z29, mVar5)).g(g14).g(a13), new L.G(p02, 0));
                                            z24 = !z29 && p02.b() && ((Boolean) p02.f10045q.getValue()).booleanValue();
                                            if (z24 && A.A0.a()) {
                                                abstractC4326r4 = U3.f.o(abstractC4326r4, new C6471i(8, t0Var));
                                            }
                                            rVar = rVar2;
                                            b(j15, t0Var, R4.b.X(rVar, -374338080, new L.F(c3288a, p02, e13, i34, i45, n04, zVar, i37, o10, d12, j14, abstractC4326r4, fVar3, t0Var, z24, z16, kVar4, sVar2, bVar)), rVar, 448);
                                            kVar3 = kVar4;
                                            abstractC5350n2 = abstractC5350n3;
                                            c0863n02 = c0863n05;
                                            z14 = z29;
                                            oVar4 = oVar7;
                                            i31 = i34;
                                            z13 = z16;
                                            oVar3 = c3288a;
                                            i33 = i37;
                                            i32 = i45;
                                            z15 = z23;
                                            mVar2 = mVar5;
                                            e11 = e13;
                                            abstractC4326r2 = abstractC4326r7;
                                        }
                                    }
                                    z23 = z20;
                                    if (z22) {
                                    }
                                    T0.k kVar72 = jVar.f16790b;
                                    kVar72.f16794d = -1;
                                    kVar72.f16795e = -1;
                                    zVar2 = T0.z.a(zVar, null, 0L, 3);
                                    T0.z zVar32 = jVar.f16789a;
                                    jVar.f16789a = zVar2;
                                    if (f6 != null) {
                                    }
                                    rVar2.W(-492369756);
                                    K13 = rVar2.K();
                                    if (K13 == iVar) {
                                    }
                                    rVar2.t(false);
                                    r02 = (R0) K13;
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    if (!r02.f10062f) {
                                    }
                                    r02.f10061e = Long.valueOf(currentTimeMillis2);
                                    r02.a(zVar);
                                    rVar2.W(-492369756);
                                    K14 = rVar2.K();
                                    if (K14 == iVar) {
                                    }
                                    rVar2.t(false);
                                    t0Var = (t0) K14;
                                    T0.s sVar22 = g12.f16757b;
                                    t0Var.f12414b = sVar22;
                                    t0Var.f12415c = p02.f10048t;
                                    t0Var.f12416d = p02;
                                    t0Var.f12417e.setValue(zVar);
                                    t0Var.f12418f = (AbstractC0696o0) rVar2.m(AbstractC0701r0.f7001d);
                                    t0Var.f12419g = (U0) rVar2.m(AbstractC0701r0.f7011n);
                                    t0Var.f12420h = (AbstractC6263a) rVar2.m(AbstractC0701r0.f7006i);
                                    t0Var.f12421i = lVar;
                                    boolean z312 = !z16;
                                    t0Var.f12422j.setValue(Boolean.valueOf(z312));
                                    rVar2.W(773894976);
                                    rVar2.W(-492369756);
                                    K15 = rVar2.K();
                                    if (K15 == iVar) {
                                    }
                                    rVar2.t(false);
                                    Ng.F f102 = ((Z.C) K15).f22442Y;
                                    w10 = AbstractC0044t0.w(rVar2, false, -492369756);
                                    if (w10 == iVar) {
                                    }
                                    rVar2.t(false);
                                    I.f fVar32 = (I.f) w10;
                                    abstractC4326r4 = C4323o.f37719b;
                                    AbstractC4326r a112 = androidx.compose.foundation.b.a(mVar5, androidx.compose.ui.focus.a.v(androidx.compose.ui.focus.a.j(abstractC4326r4, lVar), new L.I(p02, a5, z29, z16, zVar, oVar7, sVar22, t0Var, f102, fVar32)), z29);
                                    rVar2.W(-55007276);
                                    if (a5 != null) {
                                    }
                                    rVar2.t(false);
                                    AbstractC4326r a122 = B0.I.a(abstractC4326r4, 8675309, new N.N(new L.G(p02, 1), null));
                                    J j132 = new J(p02, lVar, z16, t0Var, sVar22);
                                    if (z29) {
                                    }
                                    s0 s0Var2 = t0Var.f12432t;
                                    r0 r0Var2 = t0Var.f12431s;
                                    AbstractC4326r g142 = a122.g(new SuspendPointerInputElement(s0Var2, r0Var2, new K(s0Var2, r0Var2, null), 4)).g(new PointerHoverIconModifierElement(false));
                                    AbstractC4326r d122 = androidx.compose.ui.draw.a.d(abstractC4326r4, new C3281g(p02, zVar, sVar22, 12));
                                    AbstractC4326r j142 = androidx.compose.ui.layout.a.j(abstractC4326r4, new A.A(p02, z29, h1Var, t0Var, zVar, sVar22, 3));
                                    AbstractC4326r a132 = L0.l.a(abstractC4326r4, true, new L.O(g12, zVar, z29, oVar7, z16, p02, sVar22, t0Var, lVar));
                                    if (!z29) {
                                    }
                                    C6669J c6669j2 = A0.f9856a;
                                    if (z32) {
                                    }
                                    AbstractC1734s.b(t0Var, new L.A(t0Var, 0), rVar2);
                                    AbstractC1734s.b(oVar7, new C6686a(a5, p02, zVar, oVar7, 4), rVar2);
                                    AbstractC4326r o112 = U3.f.o(abstractC4326r4, new E0(p02, t0Var, zVar, z312, i45 == 1, sVar22, r02, p02.f10048t, oVar7.f16807e));
                                    N0 n042 = n02;
                                    AbstractC4326r j152 = androidx.compose.ui.layout.a.j(U3.f.o(androidx.compose.ui.input.key.a.e(androidx.compose.ui.input.key.a.e(abstractC4326r7.g(a112), new C0043t(fVar, 8, p02)), new C0043t(p02, 7, t0Var)).g(o112), new L0(n042, z29, mVar5)).g(g142).g(a132), new L.G(p02, 0));
                                    if (!z29) {
                                    }
                                    if (z24) {
                                        abstractC4326r4 = U3.f.o(abstractC4326r4, new C6471i(8, t0Var));
                                    }
                                    rVar = rVar2;
                                    b(j152, t0Var, R4.b.X(rVar, -374338080, new L.F(c3288a, p02, e13, i34, i45, n042, zVar, i37, o10, d122, j142, abstractC4326r4, fVar32, t0Var, z24, z16, kVar4, sVar22, bVar)), rVar, 448);
                                    kVar3 = kVar4;
                                    abstractC5350n2 = abstractC5350n3;
                                    c0863n02 = c0863n05;
                                    z14 = z29;
                                    oVar4 = oVar7;
                                    i31 = i34;
                                    z13 = z16;
                                    oVar3 = c3288a;
                                    i33 = i37;
                                    i32 = i45;
                                    z15 = z23;
                                    mVar2 = mVar5;
                                    e11 = e13;
                                    abstractC4326r2 = abstractC4326r7;
                                } else {
                                    z22 = false;
                                }
                            }
                            z21 = false;
                            d11 = zVar.f16832c;
                            if (d11 != null) {
                            }
                            z23 = z20;
                            if (z22) {
                            }
                            T0.k kVar722 = jVar.f16790b;
                            kVar722.f16794d = -1;
                            kVar722.f16795e = -1;
                            zVar2 = T0.z.a(zVar, null, 0L, 3);
                            T0.z zVar322 = jVar.f16789a;
                            jVar.f16789a = zVar2;
                            if (f6 != null) {
                            }
                            rVar2.W(-492369756);
                            K13 = rVar2.K();
                            if (K13 == iVar) {
                            }
                            rVar2.t(false);
                            r02 = (R0) K13;
                            long currentTimeMillis22 = System.currentTimeMillis();
                            if (!r02.f10062f) {
                            }
                            r02.f10061e = Long.valueOf(currentTimeMillis22);
                            r02.a(zVar);
                            rVar2.W(-492369756);
                            K14 = rVar2.K();
                            if (K14 == iVar) {
                            }
                            rVar2.t(false);
                            t0Var = (t0) K14;
                            T0.s sVar222 = g12.f16757b;
                            t0Var.f12414b = sVar222;
                            t0Var.f12415c = p02.f10048t;
                            t0Var.f12416d = p02;
                            t0Var.f12417e.setValue(zVar);
                            t0Var.f12418f = (AbstractC0696o0) rVar2.m(AbstractC0701r0.f7001d);
                            t0Var.f12419g = (U0) rVar2.m(AbstractC0701r0.f7011n);
                            t0Var.f12420h = (AbstractC6263a) rVar2.m(AbstractC0701r0.f7006i);
                            t0Var.f12421i = lVar;
                            boolean z3122 = !z16;
                            t0Var.f12422j.setValue(Boolean.valueOf(z3122));
                            rVar2.W(773894976);
                            rVar2.W(-492369756);
                            K15 = rVar2.K();
                            if (K15 == iVar) {
                            }
                            rVar2.t(false);
                            Ng.F f1022 = ((Z.C) K15).f22442Y;
                            w10 = AbstractC0044t0.w(rVar2, false, -492369756);
                            if (w10 == iVar) {
                            }
                            rVar2.t(false);
                            I.f fVar322 = (I.f) w10;
                            abstractC4326r4 = C4323o.f37719b;
                            AbstractC4326r a1122 = androidx.compose.foundation.b.a(mVar5, androidx.compose.ui.focus.a.v(androidx.compose.ui.focus.a.j(abstractC4326r4, lVar), new L.I(p02, a5, z29, z16, zVar, oVar7, sVar222, t0Var, f1022, fVar322)), z29);
                            rVar2.W(-55007276);
                            if (a5 != null) {
                            }
                            rVar2.t(false);
                            AbstractC4326r a1222 = B0.I.a(abstractC4326r4, 8675309, new N.N(new L.G(p02, 1), null));
                            J j1322 = new J(p02, lVar, z16, t0Var, sVar222);
                            if (z29) {
                            }
                            s0 s0Var22 = t0Var.f12432t;
                            r0 r0Var22 = t0Var.f12431s;
                            AbstractC4326r g1422 = a1222.g(new SuspendPointerInputElement(s0Var22, r0Var22, new K(s0Var22, r0Var22, null), 4)).g(new PointerHoverIconModifierElement(false));
                            AbstractC4326r d1222 = androidx.compose.ui.draw.a.d(abstractC4326r4, new C3281g(p02, zVar, sVar222, 12));
                            AbstractC4326r j1422 = androidx.compose.ui.layout.a.j(abstractC4326r4, new A.A(p02, z29, h1Var, t0Var, zVar, sVar222, 3));
                            AbstractC4326r a1322 = L0.l.a(abstractC4326r4, true, new L.O(g12, zVar, z29, oVar7, z16, p02, sVar222, t0Var, lVar));
                            if (!z29) {
                            }
                            C6669J c6669j22 = A0.f9856a;
                            if (z32) {
                            }
                            AbstractC1734s.b(t0Var, new L.A(t0Var, 0), rVar2);
                            AbstractC1734s.b(oVar7, new C6686a(a5, p02, zVar, oVar7, 4), rVar2);
                            AbstractC4326r o1122 = U3.f.o(abstractC4326r4, new E0(p02, t0Var, zVar, z3122, i45 == 1, sVar222, r02, p02.f10048t, oVar7.f16807e));
                            N0 n0422 = n02;
                            AbstractC4326r j1522 = androidx.compose.ui.layout.a.j(U3.f.o(androidx.compose.ui.input.key.a.e(androidx.compose.ui.input.key.a.e(abstractC4326r7.g(a1122), new C0043t(fVar, 8, p02)), new C0043t(p02, 7, t0Var)).g(o1122), new L0(n0422, z29, mVar5)).g(g1422).g(a1322), new L.G(p02, 0));
                            if (!z29) {
                            }
                            if (z24) {
                            }
                            rVar = rVar2;
                            b(j1522, t0Var, R4.b.X(rVar, -374338080, new L.F(c3288a, p02, e13, i34, i45, n0422, zVar, i37, o10, d1222, j1422, abstractC4326r4, fVar322, t0Var, z24, z16, kVar4, sVar222, bVar)), rVar, 448);
                            kVar3 = kVar4;
                            abstractC5350n2 = abstractC5350n3;
                            c0863n02 = c0863n05;
                            z14 = z29;
                            oVar4 = oVar7;
                            i31 = i34;
                            z13 = z16;
                            oVar3 = c3288a;
                            i33 = i37;
                            i32 = i45;
                            z15 = z23;
                            mVar2 = mVar5;
                            e11 = e13;
                            abstractC4326r2 = abstractC4326r7;
                        } else {
                            throw new IllegalStateException("no recompose scope found".toString());
                        }
                    }
                    C1741v0 v10 = rVar.v();
                    if (v10 == null) {
                        return;
                    }
                    v10.f22739d = new C0852i(zVar, kVar, abstractC4326r2, e11, i33, kVar3, mVar2, abstractC5350n2, z15, i32, i31, oVar4, c0863n02, z14, z13, oVar3, i13, i14, i15);
                    return;
                }
                i24 = 805306368;
                i39 |= i24;
                i25 = i15 & 1024;
                if (i25 == 0) {
                }
                if ((i14 & 112) == 0) {
                }
                int i412 = i26;
                i27 = i15 & 4096;
                if (i27 == 0) {
                }
                i28 = i15 & 8192;
                if (i28 == 0) {
                }
                i29 = i15 & 16384;
                if (i29 == 0) {
                }
                i30 = i15 & 32768;
                if (i30 == 0) {
                }
                if ((i39 & 1533916891) != 306783378) {
                }
                rVar2.R();
                if ((i13 & 1) == 0) {
                }
                if (i40 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i25 == 0) {
                }
                if ((2048 & i15) == 0) {
                }
                if (i27 == 0) {
                }
                if (i28 == 0) {
                }
                if (i29 == 0) {
                }
                if (i30 == 0) {
                }
                abstractC5350n3 = abstractC5350n4;
                e12 = e14;
                i35 = i42;
                mVar3 = mVar4;
                abstractC4326r3 = abstractC4326r5;
                i36 = i43;
                kVar4 = kVar5;
                boolean z282 = z25;
                c0863n03 = c0863n04;
                z18 = z26;
                z17 = z282;
                rVar2.u();
                rVar2.W(-492369756);
                K10 = rVar2.K();
                iVar = C1723m.f22654Y;
                if (K10 == iVar) {
                }
                rVar2.t(false);
                p0.l lVar2 = (p0.l) K10;
                T0.A a52 = (T0.A) rVar2.m(AbstractC0701r0.f7009l);
                Z0.b bVar2 = (Z0.b) rVar2.m(AbstractC0701r0.f7002e);
                AbstractC4326r abstractC4326r72 = abstractC4326r3;
                S0.r rVar32 = (S0.r) rVar2.m(AbstractC0701r0.f7005h);
                D.m mVar52 = mVar3;
                boolean z292 = z18;
                long j62 = ((y0) rVar2.m(z0.f12460a)).f12456b;
                p0.f fVar22 = (p0.f) rVar2.m(AbstractC0701r0.f7003f);
                h1 h1Var2 = (h1) rVar2.m(AbstractC0701r0.f7014q);
                T0 t022 = (T0) rVar2.m(AbstractC0701r0.f7010m);
                if (i36 == 1) {
                }
                T0.o oVar72 = oVar5;
                int i452 = i36;
                Object[] objArr2 = {w02};
                i0.r rVar42 = N0.f10004f;
                C0863n0 c0863n052 = c0863n03;
                rVar2.W(-272912543);
                g10 = rVar2.g(w02);
                K11 = rVar2.K();
                if (!g10) {
                }
                K11 = new C6672L(6, w02);
                rVar2.h0(K11);
                rVar2.t(false);
                N0 n032 = (N0) Ad.l.Y0(objArr2, rVar42, (AbstractC6216a) K11, rVar2, 4);
                rVar2.W(511388516);
                g11 = rVar2.g(zVar) | rVar2.g(i35);
                K12 = rVar2.K();
                if (!g11) {
                }
                G a102 = AbstractC0857k0.a(i35, zVar.f16830a);
                d10 = zVar.f16832c;
                if (d10 == null) {
                }
                rVar2.h0(K12);
                rVar2.t(false);
                G g122 = (G) K12;
                C1046e c1046e5 = g122.f16756a;
                z19 = rVar2.z();
                if (z19 == null) {
                }
            }
            i18 = i15 & 16;
            if (i18 != 0) {
            }
            i19 = i15 & 32;
            if (i19 != 0) {
            }
            i20 = i15 & 64;
            if (i20 != 0) {
            }
            i21 = i15 & 128;
            if (i21 != 0) {
            }
            i22 = i15 & 256;
            if (i22 != 0) {
            }
            i23 = i15 & 512;
            if (i23 == 0) {
            }
            i39 |= i24;
            i25 = i15 & 1024;
            if (i25 == 0) {
            }
            if ((i14 & 112) == 0) {
            }
            int i4122 = i26;
            i27 = i15 & 4096;
            if (i27 == 0) {
            }
            i28 = i15 & 8192;
            if (i28 == 0) {
            }
            i29 = i15 & 16384;
            if (i29 == 0) {
            }
            i30 = i15 & 32768;
            if (i30 == 0) {
            }
            if ((i39 & 1533916891) != 306783378) {
            }
            rVar2.R();
            if ((i13 & 1) == 0) {
            }
            if (i40 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if ((2048 & i15) == 0) {
            }
            if (i27 == 0) {
            }
            if (i28 == 0) {
            }
            if (i29 == 0) {
            }
            if (i30 == 0) {
            }
            abstractC5350n3 = abstractC5350n4;
            e12 = e14;
            i35 = i42;
            mVar3 = mVar4;
            abstractC4326r3 = abstractC4326r5;
            i36 = i43;
            kVar4 = kVar5;
            boolean z2822 = z25;
            c0863n03 = c0863n04;
            z18 = z26;
            z17 = z2822;
            rVar2.u();
            rVar2.W(-492369756);
            K10 = rVar2.K();
            iVar = C1723m.f22654Y;
            if (K10 == iVar) {
            }
            rVar2.t(false);
            p0.l lVar22 = (p0.l) K10;
            T0.A a522 = (T0.A) rVar2.m(AbstractC0701r0.f7009l);
            Z0.b bVar22 = (Z0.b) rVar2.m(AbstractC0701r0.f7002e);
            AbstractC4326r abstractC4326r722 = abstractC4326r3;
            S0.r rVar322 = (S0.r) rVar2.m(AbstractC0701r0.f7005h);
            D.m mVar522 = mVar3;
            boolean z2922 = z18;
            long j622 = ((y0) rVar2.m(z0.f12460a)).f12456b;
            p0.f fVar222 = (p0.f) rVar2.m(AbstractC0701r0.f7003f);
            h1 h1Var22 = (h1) rVar2.m(AbstractC0701r0.f7014q);
            T0 t0222 = (T0) rVar2.m(AbstractC0701r0.f7010m);
            if (i36 == 1) {
            }
            T0.o oVar722 = oVar5;
            int i4522 = i36;
            Object[] objArr22 = {w02};
            i0.r rVar422 = N0.f10004f;
            C0863n0 c0863n0522 = c0863n03;
            rVar2.W(-272912543);
            g10 = rVar2.g(w02);
            K11 = rVar2.K();
            if (!g10) {
            }
            K11 = new C6672L(6, w02);
            rVar2.h0(K11);
            rVar2.t(false);
            N0 n0322 = (N0) Ad.l.Y0(objArr22, rVar422, (AbstractC6216a) K11, rVar2, 4);
            rVar2.W(511388516);
            g11 = rVar2.g(zVar) | rVar2.g(i35);
            K12 = rVar2.K();
            if (!g11) {
            }
            G a1022 = AbstractC0857k0.a(i35, zVar.f16830a);
            d10 = zVar.f16832c;
            if (d10 == null) {
            }
            rVar2.h0(K12);
            rVar2.t(false);
            G g1222 = (G) K12;
            C1046e c1046e52 = g1222.f16756a;
            z19 = rVar2.z();
            if (z19 == null) {
            }
        }
        i17 = i15 & 8;
        if (i17 == 0) {
        }
        i18 = i15 & 16;
        if (i18 != 0) {
        }
        i19 = i15 & 32;
        if (i19 != 0) {
        }
        i20 = i15 & 64;
        if (i20 != 0) {
        }
        i21 = i15 & 128;
        if (i21 != 0) {
        }
        i22 = i15 & 256;
        if (i22 != 0) {
        }
        i23 = i15 & 512;
        if (i23 == 0) {
        }
        i39 |= i24;
        i25 = i15 & 1024;
        if (i25 == 0) {
        }
        if ((i14 & 112) == 0) {
        }
        int i41222 = i26;
        i27 = i15 & 4096;
        if (i27 == 0) {
        }
        i28 = i15 & 8192;
        if (i28 == 0) {
        }
        i29 = i15 & 16384;
        if (i29 == 0) {
        }
        i30 = i15 & 32768;
        if (i30 == 0) {
        }
        if ((i39 & 1533916891) != 306783378) {
        }
        rVar2.R();
        if ((i13 & 1) == 0) {
        }
        if (i40 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i25 == 0) {
        }
        if ((2048 & i15) == 0) {
        }
        if (i27 == 0) {
        }
        if (i28 == 0) {
        }
        if (i29 == 0) {
        }
        if (i30 == 0) {
        }
        abstractC5350n3 = abstractC5350n4;
        e12 = e14;
        i35 = i42;
        mVar3 = mVar4;
        abstractC4326r3 = abstractC4326r5;
        i36 = i43;
        kVar4 = kVar5;
        boolean z28222 = z25;
        c0863n03 = c0863n04;
        z18 = z26;
        z17 = z28222;
        rVar2.u();
        rVar2.W(-492369756);
        K10 = rVar2.K();
        iVar = C1723m.f22654Y;
        if (K10 == iVar) {
        }
        rVar2.t(false);
        p0.l lVar222 = (p0.l) K10;
        T0.A a5222 = (T0.A) rVar2.m(AbstractC0701r0.f7009l);
        Z0.b bVar222 = (Z0.b) rVar2.m(AbstractC0701r0.f7002e);
        AbstractC4326r abstractC4326r7222 = abstractC4326r3;
        S0.r rVar3222 = (S0.r) rVar2.m(AbstractC0701r0.f7005h);
        D.m mVar5222 = mVar3;
        boolean z29222 = z18;
        long j6222 = ((y0) rVar2.m(z0.f12460a)).f12456b;
        p0.f fVar2222 = (p0.f) rVar2.m(AbstractC0701r0.f7003f);
        h1 h1Var222 = (h1) rVar2.m(AbstractC0701r0.f7014q);
        T0 t02222 = (T0) rVar2.m(AbstractC0701r0.f7010m);
        if (i36 == 1) {
        }
        T0.o oVar7222 = oVar5;
        int i45222 = i36;
        Object[] objArr222 = {w02};
        i0.r rVar4222 = N0.f10004f;
        C0863n0 c0863n05222 = c0863n03;
        rVar2.W(-272912543);
        g10 = rVar2.g(w02);
        K11 = rVar2.K();
        if (!g10) {
        }
        K11 = new C6672L(6, w02);
        rVar2.h0(K11);
        rVar2.t(false);
        N0 n03222 = (N0) Ad.l.Y0(objArr222, rVar4222, (AbstractC6216a) K11, rVar2, 4);
        rVar2.W(511388516);
        g11 = rVar2.g(zVar) | rVar2.g(i35);
        K12 = rVar2.K();
        if (!g11) {
        }
        G a10222 = AbstractC0857k0.a(i35, zVar.f16830a);
        d10 = zVar.f16832c;
        if (d10 == null) {
        }
        rVar2.h0(K12);
        rVar2.t(false);
        G g12222 = (G) K12;
        C1046e c1046e522 = g12222.f16756a;
        z19 = rVar2.z();
        if (z19 == null) {
        }
    }

    public static final void b(AbstractC4326r abstractC4326r, t0 t0Var, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-20551815);
        rVar.W(733328855);
        E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, true, rVar);
        rVar.W(-1323940314);
        int i11 = rVar.P;
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(abstractC4326r);
        if (rVar.f22696a instanceof AbstractC1707e) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(c0582k);
            } else {
                rVar.k0();
            }
            U3.f.n0(rVar, c10, C0583l.f5808f);
            U3.f.n0(rVar, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar, i11, c0581j);
            }
            AbstractC6463a.r(0, i12, new Z.L0(rVar), rVar, 2058660585);
            rVar.W(-1985516685);
            AbstractC6463a.s(((((i10 >> 3) & 112) | 8) >> 3) & 14, nVar, rVar, false, false);
            rVar.t(true);
            rVar.t(false);
            rVar.t(false);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new U(abstractC4326r, t0Var, nVar, i10, 2);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static final long c(int i10, int i11) {
        long j6 = (i11 & 4294967295L) | (i10 << 32);
        int i12 = Z0.i.f22798c;
        return j6;
    }

    public static final D.n d() {
        return new D.n(0);
    }

    public static final void e(t0 t0Var, AbstractC1725n abstractC1725n, int i10) {
        C1046e c1046e;
        Q0 q02;
        w0 w0Var;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1436003720);
        P0 p02 = t0Var.f12416d;
        if (p02 != null && ((Boolean) p02.f10043o.getValue()).booleanValue()) {
            P0 p03 = t0Var.f12416d;
            if (p03 != null && (w0Var = p03.f10029a) != null) {
                c1046e = w0Var.f10339a;
            } else {
                c1046e = null;
            }
            if (c1046e != null && c1046e.f12512Y.length() > 0) {
                rVar.W(1157296644);
                boolean g10 = rVar.g(t0Var);
                Object K10 = rVar.K();
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (g10 || K10 == iVar) {
                    K10 = new r0(t0Var, 0);
                    rVar.h0(K10);
                }
                rVar.t(false);
                x0 x0Var = (x0) K10;
                Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                T0.s sVar = t0Var.f12414b;
                long j6 = t0Var.j().f16831b;
                int i11 = N0.D.f12484c;
                int b10 = sVar.b((int) (j6 >> 32));
                P0 p04 = t0Var.f12416d;
                if (p04 != null) {
                    q02 = p04.d();
                } else {
                    q02 = null;
                }
                AbstractC3557B.Z(q02);
                N0.C c10 = q02.f10054a;
                C5252d c11 = c10.c(com.google.android.gms.internal.play_billing.N.p(b10, 0, c10.f12477a.f12467a.f12512Y.length()));
                long r10 = R4.b.r((bVar.R(A0.f9857b) / 2) + c11.f43625a, c11.f43628d);
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(x0Var, null, new L.U(x0Var, t0Var, null), 6);
                rVar.W(-272875148);
                boolean f6 = rVar.f(r10);
                Object K11 = rVar.K();
                if (f6 || K11 == iVar) {
                    K11 = new C0840c(r10, 1);
                    rVar.h0(K11);
                }
                rVar.t(false);
                AbstractC0844e.a(r10, L0.l.a(suspendPointerInputElement, false, (wf.k) K11), null, rVar, 384);
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(t0Var, i10, 4);
        }
    }

    public static final void f(t0 t0Var, boolean z10, AbstractC1725n abstractC1725n, int i10) {
        Q0 d10;
        N0.C c10;
        boolean z11;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(626339208);
        if (z10) {
            P0 p02 = t0Var.f12416d;
            N0.C c11 = null;
            if (p02 != null && (d10 = p02.d()) != null && (c10 = d10.f10054a) != null) {
                P0 p03 = t0Var.f12416d;
                if (p03 != null) {
                    z11 = p03.f10044p;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    c11 = c10;
                }
            }
            if (c11 != null) {
                if (!N0.D.b(t0Var.j().f16831b)) {
                    int b10 = t0Var.f12414b.b((int) (t0Var.j().f16831b >> 32));
                    int b11 = t0Var.f12414b.b((int) (t0Var.j().f16831b & 4294967295L));
                    Y0.h a5 = c11.a(b10);
                    Y0.h a10 = c11.a(Math.max(b11 - 1, 0));
                    rVar.W(-498386764);
                    P0 p04 = t0Var.f12416d;
                    if (p04 != null && ((Boolean) p04.f10041m.getValue()).booleanValue()) {
                        Ng.H.g(true, a5, t0Var, rVar, 518);
                    }
                    rVar.t(false);
                    P0 p05 = t0Var.f12416d;
                    if (p05 != null && ((Boolean) p05.f10042n.getValue()).booleanValue()) {
                        Ng.H.g(false, a10, t0Var, rVar, 518);
                    }
                }
                P0 p06 = t0Var.f12416d;
                if (p06 != null) {
                    boolean z12 = !AbstractC3557B.K(t0Var.f12429q.f16830a.f12512Y, t0Var.j().f16830a.f12512Y);
                    C1724m0 c1724m0 = p06.f10040l;
                    if (z12) {
                        c1724m0.setValue(Boolean.FALSE);
                    }
                    if (p06.b()) {
                        if (((Boolean) c1724m0.getValue()).booleanValue()) {
                            t0Var.n();
                        } else {
                            t0Var.k();
                        }
                    }
                }
            }
        } else {
            t0Var.k();
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new P(t0Var, z10, i10, 0);
        }
    }

    public static final void g(int i10, List list) {
        int size = list.size();
        if (i10 >= 0 && i10 < size) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0044t0.y("Index ", i10, " is out of bounds. The list has ", size, " elements."));
    }

    public static final void h(List list, int i10, int i11) {
        int size = list.size();
        if (i10 <= i11) {
            if (i10 >= 0) {
                if (i11 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException(AbstractC4194d.v("fromIndex (", i10, ") is less than 0."));
        }
        throw new IllegalArgumentException(AbstractC0044t0.y("Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", i11, ")."));
    }

    public static final boolean i(AbstractC4705d abstractC4705d, long j6) {
        if (!((AbstractC4325q) abstractC4705d).f37720Y.f37732r0) {
            return false;
        }
        C0595y c0595y = AbstractC0579h.A(abstractC4705d).f24831B0.f5701b;
        if (!c0595y.G0().f37732r0) {
            return false;
        }
        long j10 = c0595y.f4055h0;
        long l10 = androidx.compose.ui.layout.a.l(c0595y);
        float d10 = C5251c.d(l10);
        float e10 = C5251c.e(l10);
        float f6 = ((int) (j10 >> 32)) + d10;
        float f10 = ((int) (j10 & 4294967295L)) + e10;
        float d11 = C5251c.d(j6);
        if (d10 > d11 || d11 > f6) {
            return false;
        }
        float e11 = C5251c.e(j6);
        if (e10 > e11 || e11 > f10) {
            return false;
        }
        return true;
    }

    public static final void j(P0 p02) {
        T0.F f6 = p02.f10033e;
        if (f6 != null) {
            p02.f10048t.invoke(T0.z.a(p02.f10032d.f16789a, null, 0L, 3));
            T0.A a5 = f6.f16754a;
            AtomicReference atomicReference = a5.f16731b;
            while (true) {
                if (atomicReference.compareAndSet(f6, null)) {
                    T0.D d10 = (T0.D) a5.f16730a;
                    d10.f16741d = false;
                    d10.f16742e = C1409d.f16765k0;
                    d10.f16743f = C1409d.f16766l0;
                    d10.f16748k = null;
                    d10.a(T0.B.f16733Z);
                    break;
                } else if (atomicReference.get() != f6) {
                    break;
                }
            }
        }
        p02.f10033e = null;
    }

    public static final boolean k(N0.E e10) {
        C1049h c1049h;
        N0.s sVar;
        N0.u uVar = e10.f12489c;
        if (uVar != null && (sVar = uVar.f12568b) != null) {
            c1049h = new C1049h(sVar.f12565b);
        } else {
            c1049h = null;
        }
        boolean z10 = false;
        if (c1049h != null && c1049h.f12523a == 1) {
            z10 = true;
        }
        return !z10;
    }

    public static final boolean l(int i10, KeyEvent keyEvent) {
        if (((int) (androidx.compose.ui.input.key.a.b(keyEvent) >> 32)) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(2:4|(7:6|8|21|(1:(1:11)(2:12|13))(3:14|15|(1:23))|20|17|18))|7|8|21|(0)(0)|20|17|18) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(W.A a5, wf.n nVar, AbstractC4825e abstractC4825e) {
        C1591o c1591o;
        int i10;
        if (abstractC4825e instanceof C1591o) {
            C1591o c1591o2 = (C1591o) abstractC4825e;
            int i11 = c1591o2.f20249Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1591o2.f20249Z = i11 - Integer.MIN_VALUE;
                c1591o = c1591o2;
                Object obj = c1591o.f20248Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1591o.f20249Z;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C1610s c1610s = new C1610s(a5, nVar, null);
                    c1591o.f20249Z = 1;
                    if (Ad.l.e0(c1610s, c1591o) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return jf.y.f36177a;
            }
        }
        c1591o = new AbstractC5156c(abstractC4825e);
        Object obj2 = c1591o.f20248Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1591o.f20249Z;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public static final void n(T0.A a5, P0 p02, T0.z zVar, T0.o oVar, T0.s sVar) {
        T0.j jVar = p02.f10032d;
        ?? obj = new Object();
        C3281g c3281g = new C3281g(jVar, p02.f10048t, obj, 13);
        T0.u uVar = a5.f16730a;
        T0.D d10 = (T0.D) uVar;
        d10.f16741d = true;
        d10.f16744g = zVar;
        d10.f16745h = oVar;
        d10.f16742e = c3281g;
        d10.f16743f = p02.f10049u;
        d10.a(T0.B.f16732Y);
        T0.F f6 = new T0.F(a5, uVar);
        a5.f16731b.set(f6);
        obj.f37622Y = f6;
        p02.f10033e = f6;
        E(p02, zVar, sVar);
    }

    public static AbstractC5502d o(AbstractC5502d abstractC5502d) {
        C5517s c5517s = AbstractC5508j.f45058b;
        C5499a c5499a = AbstractC5500b.f45016b;
        if (AbstractC5501c.a(abstractC5502d.f45024b, AbstractC5501c.f45018a)) {
            C5515q c5515q = (C5515q) abstractC5502d;
            C5517s c5517s2 = c5515q.f45075d;
            if (!s(c5517s2, c5517s)) {
                float[] a5 = c5517s.a();
                return new C5515q(c5515q.f45023a, c5515q.f45079h, c5517s, y(r(c5499a.f45017a, c5517s2.a(), a5), c5515q.f45080i), c5515q.f45082k, c5515q.f45085n, c5515q.f45076e, c5515q.f45077f, c5515q.f45078g, -1);
            }
            return abstractC5502d;
        }
        return abstractC5502d;
    }

    public static final Object p(W.C c10, Object obj, float f6, AbstractC4825e abstractC4825e) {
        Object b10 = c10.b(obj, B0.f14Y, new C1586n(c10, f6, null), abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return jf.y.f36177a;
    }

    public static final int q(H.F f6, int i10) {
        H.A a5;
        Object obj;
        float f10;
        List list = ((H.x) f6.g()).f6694a;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            a5 = f6.f6549d;
            if (i12 < size) {
                obj = list.get(i12);
                if (((C0659h) ((AbstractC0660i) obj)).f6623a == a5.a()) {
                    break;
                }
                i12++;
            } else {
                obj = null;
                break;
            }
        }
        AbstractC0660i abstractC0660i = (AbstractC0660i) obj;
        if (abstractC0660i != null) {
            i11 = ((C0659h) abstractC0660i).f6635m;
        }
        if (i10 == 0) {
            f10 = a5.b();
        } else {
            f10 = (-i11) / i10;
        }
        return -AbstractC4344b.Y0(((a5.b() - f10) * i10) - i11);
    }

    public static final float[] r(float[] fArr, float[] fArr2, float[] fArr3) {
        A(fArr, fArr2);
        A(fArr, fArr3);
        return y(x(fArr), z(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean s(C5517s c5517s, C5517s c5517s2) {
        if (c5517s == c5517s2) {
            return true;
        }
        if (Math.abs(c5517s.f45096a - c5517s2.f45096a) < 0.001f && Math.abs(c5517s.f45097b - c5517s2.f45097b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final S0.t t(Context context) {
        int i10;
        C1341b c1341b = new C1341b(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = A1.b.a(context.getResources().getConfiguration());
        } else {
            i10 = 0;
        }
        return new S0.t(c1341b, new C1343d(i10));
    }

    public static Drawable u(Context context, int i10) {
        return X0.d().f(context, i10);
    }

    public static final AbstractC1700a0 v(AbstractC4831k abstractC4831k) {
        AbstractC1700a0 abstractC1700a0 = (AbstractC1700a0) abstractC4831k.get(C1723m.f22655Z);
        if (abstractC1700a0 != null) {
            return abstractC1700a0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final String w(int i10, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.m(Z.f6887a);
        return ((Context) rVar.m(Z.f6888b)).getResources().getString(i10);
    }

    public static final float[] x(float[] fArr) {
        float f6 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f6 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f6) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f6)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f6)) / f21;
        fArr2[8] = ((f6 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    public static final float[] y(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f10 = fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        float f15 = (f13 * f14) + (f11 * f12) + (f6 * f10);
        float f16 = fArr[1];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = (f18 * f14) + (f17 * f12) + (f16 * f10);
        float f20 = fArr[2];
        float f21 = fArr[5];
        float f22 = fArr[8];
        float f23 = (f14 * f22) + (f12 * f21) + (f10 * f20);
        float f24 = fArr2[3];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        float f27 = (f13 * f26) + (f11 * f25) + (f6 * f24);
        float f28 = (f17 * f25) + (f16 * f24);
        float f29 = (f26 * f22) + (f25 * f21) + (f24 * f20);
        float f30 = fArr2[6];
        float f31 = fArr2[7];
        float f32 = (f11 * f31) + (f6 * f30);
        float f33 = fArr2[8];
        return new float[]{f15, f19, f23, f27, (f18 * f26) + f28, f29, (f13 * f33) + f32, (f18 * f33) + (f17 * f31) + (f16 * f30), (f22 * f33) + (f21 * f31) + (f20 * f30)};
    }

    public static final float[] z(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f10 = fArr2[0] * f6;
        float f11 = fArr[1];
        float f12 = fArr2[1] * f11;
        float f13 = fArr[2];
        return new float[]{f10, f12, fArr2[2] * f13, fArr2[3] * f6, fArr2[4] * f11, fArr2[5] * f13, f6 * fArr2[6], f11 * fArr2[7], f13 * fArr2[8]};
    }
}
