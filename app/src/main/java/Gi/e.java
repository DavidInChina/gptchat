package Gi;

import A.C0053y;
import A.V0;
import B.AbstractC0168u1;
import B.W0;
import Cf.g;
import Df.q;
import E0.b0;
import E0.n0;
import F.C0530d;
import F.s;
import G.A;
import G.C0550e;
import G.C0566v;
import G.C0567w;
import G.C0570z;
import G.D;
import G.E;
import G.I;
import G.M;
import G.Q;
import G.T;
import G.U;
import G.V;
import G.W;
import G.X;
import G.a0;
import G.c0;
import G0.C0571a;
import G3.o;
import H0.Z;
import H3.f;
import I8.p;
import I8.t;
import I8.w;
import L0.h;
import Ng.F;
import U3.j;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C;
import Z.C1720k0;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import Z.m1;
import Z.r;
import Z0.l;
import Z1.C1774p;
import Z1.C1783z;
import Z1.H0;
import Z1.O;
import a2.C1921e;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h.C3281g;
import h0.C3288a;
import i0.m;
import id.AbstractC3557B;
import io.sentry.hints.i;
import j0.AbstractC3893i;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kf.v;
import l0.AbstractC4326r;
import l0.C4323o;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import pf.AbstractC5156c;
import r9.y;
import s1.C5527i;
import s2.AbstractC5530A;
import s2.u;
import s3.C5547J;
import s3.C5548K;
import s3.C5549L;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v5.C5976c;
import w.C6077x;
import w5.C6122c;
import wf.AbstractC6216a;
import wf.k;
import wf.n;
import y.AbstractC6463a;
import y.C6475m;
import z.C6672L;
import z.C6675O;
import z.C6677Q;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static d f6516a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6517b;

    /* renamed from: c  reason: collision with root package name */
    public static C5953f f6518c;

    /* renamed from: d  reason: collision with root package name */
    public static C5953f f6519d;

    /* renamed from: e  reason: collision with root package name */
    public static C5953f f6520e;

    /* renamed from: f  reason: collision with root package name */
    public static long f6521f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f6522g;

    /* renamed from: h  reason: collision with root package name */
    public static Method f6523h;

    /* renamed from: i  reason: collision with root package name */
    public static Method f6524i;

    /* renamed from: j  reason: collision with root package name */
    public static C5953f f6525j;

    public static PropertyValuesHolder A(TypedArray typedArray, int i10, int i11, int i12, String str) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        f fVar;
        int i15;
        int i16;
        int i17;
        float f6;
        PropertyValuesHolder ofFloat;
        float f10;
        float f11;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if (i10 == 4) {
            if ((z10 && C(i13)) || (z11 && C(i14))) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            C5527i[] k02 = R4.b.k0(string);
            C5527i[] k03 = R4.b.k0(string2);
            if (k02 == null && k03 == null) {
                return null;
            }
            if (k02 != null) {
                o oVar = new o(1);
                if (k03 != null) {
                    if (R4.b.P(k02, k03)) {
                        ofObject = PropertyValuesHolder.ofObject(str, oVar, k02, k03);
                    } else {
                        throw new InflateException(android.gov.nist.core.a.k(" Can't morph from ", string, " to ", string2));
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, oVar, k02);
                }
                return ofObject;
            } else if (k03 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new o(1), k03);
            }
        }
        if (i10 == 3) {
            fVar = f.f7365a;
        } else {
            fVar = null;
        }
        if (z12) {
            if (z10) {
                if (i13 == 5) {
                    f10 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i11, 0.0f);
                }
                if (z11) {
                    if (i14 == 5) {
                        f11 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f11 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10, f11);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10);
                }
            } else {
                if (i14 == 5) {
                    f6 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f6 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f6);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i13 == 5) {
                i16 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (C(i13)) {
                i16 = typedArray.getColor(i11, 0);
            } else {
                i16 = typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    i17 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (C(i14)) {
                    i17 = typedArray.getColor(i12, 0);
                } else {
                    i17 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16, i17);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16);
            }
        } else if (z11) {
            if (i14 == 5) {
                i15 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (C(i14)) {
                i15 = typedArray.getColor(i12, 0);
            } else {
                i15 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static void B(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean C(int i10) {
        if (i10 >= 28 && i10 <= 31) {
            return true;
        }
        return false;
    }

    public static boolean D() {
        if (Build.VERSION.SDK_INT >= 29) {
            return F3.a.c();
        }
        try {
            if (f6522g == null) {
                f6521f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f6522g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f6522g.invoke(null, Long.valueOf(f6521f))).booleanValue();
        } catch (Exception e10) {
            B("isTagEnabled", e10);
            return false;
        }
    }

    public static final void E(Activity activity, Intent intent) {
        StrictMode.VmPolicy vmPolicy;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra != null) {
            Intent intent2 = (Intent) parcelableExtra;
            if (intent.hasExtra("android.widget.extra.CHECKED")) {
                intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
            }
            String stringExtra = intent.getStringExtra("ACTION_TYPE");
            if (stringExtra != null) {
                C6677Q c6677q = new C6677Q(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 3);
                StrictMode.VmPolicy vmPolicy2 = StrictMode.getVmPolicy();
                if (Build.VERSION.SDK_INT >= 31) {
                    vmPolicy = C1921e.f23857a.a(new StrictMode.VmPolicy.Builder(vmPolicy2)).build();
                } else {
                    vmPolicy = new StrictMode.VmPolicy.Builder().build();
                }
                StrictMode.setVmPolicy(vmPolicy);
                c6677q.mo122invoke();
                StrictMode.setVmPolicy(vmPolicy2);
                activity.finish();
                return;
            }
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type".toString());
        }
        throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.".toString());
    }

    public static final AbstractC4326r F(AbstractC4326r abstractC4326r, A a5, C0567w c0567w, boolean z10, l lVar, W0 w02, boolean z11, AbstractC1725n abstractC1725n) {
        AbstractC4326r abstractC4326r2;
        r rVar = (r) abstractC1725n;
        rVar.W(1331498025);
        if (!z11) {
            abstractC4326r2 = abstractC4326r;
        } else {
            Object[] objArr = {a5, c0567w, Boolean.valueOf(z10), lVar, w02};
            rVar.W(-568225417);
            boolean z12 = false;
            for (int i10 = 0; i10 < 5; i10++) {
                z12 |= rVar.g(objArr[i10]);
            }
            Object K10 = rVar.K();
            if (z12 || K10 == C1723m.f22654Y) {
                K10 = new C0570z(a5, c0567w, z10, lVar, w02);
                rVar.h0(K10);
            }
            rVar.t(false);
            abstractC4326r2 = abstractC4326r.g((AbstractC4326r) K10);
        }
        rVar.t(false);
        return abstractC4326r2;
    }

    public static final AbstractC4326r G(AbstractC4326r abstractC4326r, q qVar, V v10, W0 w02, boolean z10, boolean z11, AbstractC1725n abstractC1725n) {
        boolean z12;
        V0 v02;
        L0.b bVar;
        r rVar = (r) abstractC1725n;
        rVar.W(1070136913);
        rVar.W(773894976);
        rVar.W(-492369756);
        Object K10 = rVar.K();
        i iVar = C1723m.f22654Y;
        if (K10 == iVar) {
            C c10 = new C(AbstractC1734s.k(rVar));
            rVar.h0(c10);
            K10 = c10;
        }
        rVar.t(false);
        F f6 = ((C) K10).f22442Y;
        rVar.t(false);
        Object[] objArr = {qVar, v10, w02, Boolean.valueOf(z10)};
        rVar.W(-568225417);
        boolean z13 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            z13 |= rVar.g(objArr[i10]);
        }
        Object K11 = rVar.K();
        if (z13 || K11 == iVar) {
            if (w02 == W0.f1213Y) {
                z12 = true;
            } else {
                z12 = false;
            }
            X x10 = new X(qVar, 0);
            h hVar = new h(new W(v10, 0), new W(v10, 1), z11);
            C3281g c3281g = null;
            if (z10) {
                v02 = new V0(z12, f6, v10, 1);
            } else {
                v02 = null;
            }
            if (z10) {
                c3281g = new C3281g(qVar, f6, v10, 10);
            }
            C3281g c3281g2 = c3281g;
            C0530d c0530d = (C0530d) v10;
            int i11 = c0530d.f4918a;
            boolean z14 = c0530d.f4919b;
            switch (i11) {
                case 0:
                    if (z14) {
                        bVar = new L0.b(-1, 1);
                        break;
                    } else {
                        bVar = new L0.b(1, -1);
                        break;
                    }
                default:
                    AbstractC0168u1 abstractC0168u1 = c0530d.f4920c;
                    if (z14) {
                        bVar = new L0.b(((H.F) abstractC0168u1).h(), 1);
                        break;
                    } else {
                        bVar = new L0.b(1, ((H.F) abstractC0168u1).h());
                        break;
                    }
            }
            K11 = new AppendedSemanticsElement(new A.A(x10, z12, hVar, v02, c3281g2, bVar, 1), false);
            rVar.h0(K11);
        }
        rVar.t(false);
        AbstractC4326r g10 = abstractC4326r.g((AbstractC4326r) K11);
        rVar.t(false);
        return g10;
    }

    public static ValueAnimator H(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i10;
        int i11;
        int i12;
        int i13;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        int i16 = 0;
        TypedArray O02 = y.O0(resources, theme, attributeSet, H3.a.f7348g);
        TypedArray O03 = y.O0(resources, theme, attributeSet, H3.a.f7352k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        boolean z02 = y.z0(xmlResourceParser, "duration");
        int i17 = RCHTTPStatusCodes.UNSUCCESSFUL;
        if (z02) {
            i17 = O02.getInt(1, RCHTTPStatusCodes.UNSUCCESSFUL);
        }
        long j6 = i17;
        if (!y.z0(xmlResourceParser, "startOffset")) {
            i10 = 0;
        } else {
            i10 = O02.getInt(2, 0);
        }
        long j10 = i10;
        if (!y.z0(xmlResourceParser, "valueType")) {
            i11 = 4;
        } else {
            i11 = O02.getInt(7, 4);
        }
        if (y.z0(xmlResourceParser, "valueFrom") && y.z0(xmlResourceParser, "valueTo")) {
            if (i11 == 4) {
                TypedValue peekValue = O02.peekValue(5);
                if (peekValue != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i14 = peekValue.type;
                } else {
                    i14 = 0;
                }
                TypedValue peekValue2 = O02.peekValue(6);
                if (peekValue2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i15 = peekValue2.type;
                } else {
                    i15 = 0;
                }
                if ((z10 && C(i14)) || (z11 && C(i15))) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
            }
            PropertyValuesHolder A10 = A(O02, i11, 5, 6, "");
            if (A10 != null) {
                valueAnimator.setValues(A10);
            }
        }
        valueAnimator.setDuration(j6);
        valueAnimator.setStartDelay(j10);
        if (!y.z0(xmlResourceParser, "repeatCount")) {
            i12 = 0;
        } else {
            i12 = O02.getInt(3, 0);
        }
        valueAnimator.setRepeatCount(i12);
        if (!y.z0(xmlResourceParser, "repeatMode")) {
            i13 = 1;
        } else {
            i13 = O02.getInt(4, 1);
        }
        valueAnimator.setRepeatMode(i13);
        if (O03 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String s02 = y.s0(O03, xmlResourceParser, "pathData", 1);
            if (s02 != null) {
                String s03 = y.s0(O03, xmlResourceParser, "propertyXName", 2);
                String s04 = y.s0(O03, xmlResourceParser, "propertyYName", 3);
                if (s03 == null && s04 == null) {
                    throw new InflateException(O03.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path l02 = R4.b.l0(s02);
                PathMeasure pathMeasure = new PathMeasure(l02, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f6 = 0.0f;
                while (true) {
                    f6 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f6));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator = valueAnimator;
                }
                PathMeasure pathMeasure2 = new PathMeasure(l02, false);
                int min = Math.min(100, ((int) (f6 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f10 = f6 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = O02;
                int i18 = 0;
                int i19 = 0;
                float f11 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i19 >= min) {
                        break;
                    }
                    int i20 = min;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i18)).floatValue(), fArr3, null);
                    fArr[i19] = fArr3[0];
                    fArr2[i19] = fArr3[1];
                    f11 += f10;
                    int i21 = i18 + 1;
                    if (i21 < arrayList.size() && f11 > ((Float) arrayList.get(i21)).floatValue()) {
                        pathMeasure2.nextContour();
                        i18 = i21;
                    }
                    i19++;
                    min = i20;
                }
                if (s03 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(s03, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (s04 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(s04, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i16 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i16 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = O02;
                objectAnimator2.setPropertyName(y.s0(O03, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = O02;
        }
        if (!y.z0(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i16 = typedArray2.getResourceId(i16, i16);
        }
        if (i16 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i16));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (O03 != null) {
            O03.recycle();
        }
        return valueAnimator3;
    }

    public static final C5548K I(k kVar) {
        C5549L c5549l = new C5549L();
        kVar.invoke(c5549l);
        boolean z10 = c5549l.f45255b;
        C5547J c5547j = c5549l.f45254a;
        c5547j.getClass();
        boolean z11 = c5549l.f45256c;
        c5547j.getClass();
        int i10 = c5549l.f45257d;
        boolean z12 = c5549l.f45258e;
        c5547j.getClass();
        c5547j.getClass();
        c5547j.getClass();
        c5547j.getClass();
        return new C5548K(z10, z11, i10, false, z12, c5547j.f45241a, c5547j.f45242b, c5547j.f45243c, c5547j.f45244d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(C3288a c3288a, AbstractC4825e abstractC4825e) {
        O o10;
        int i10;
        if (abstractC4825e instanceof O) {
            O o11 = (O) abstractC4825e;
            int i11 = o11.f22892Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o11.f22892Z = i11 - Integer.MIN_VALUE;
                o10 = o11;
                Object obj = o10.f22891Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = o10.f22892Z;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                    throw new RuntimeException();
                }
                N.B0(obj);
                Z1.A a5 = (Z1.A) o10.getContext().get(C1783z.f23135Y);
                if (a5 != null) {
                    o10.f22892Z = 1;
                    ((C1774p) a5).b(c3288a, o10);
                    return;
                }
                throw new IllegalStateException("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance".toString());
            }
        }
        o10 = new AbstractC5156c(abstractC4825e);
        Object obj2 = o10.f22891Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = o10.f22892Z;
        if (i10 == 0) {
        }
    }

    public static final Cursor K(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, CancellationSignal cancellationSignal, C3.a aVar) {
        AbstractC3557B.c0("sQLiteDatabase", sQLiteDatabase);
        AbstractC3557B.c0("sql", str);
        AbstractC3557B.c0("cancellationSignal", cancellationSignal);
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, str, strArr, null, cancellationSignal);
        AbstractC3557B.b0("sQLiteDatabase.rawQueryW\u2026ationSignal\n            )", rawQueryWithFactory);
        return rawQueryWithFactory;
    }

    public static byte[] L(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new IllegalStateException(android.gov.nist.core.a.e("Not enough bytes to read: ", i10));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r0.finished() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] M(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int i13 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i13 += inflater.inflate(bArr, i13, i11 - i13);
                        i12 += read;
                    } catch (DataFormatException e10) {
                        throw new IllegalStateException(e10.getMessage());
                    }
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    public static int N(int i10, u uVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return uVar.u() + 1;
            case 7:
                return uVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long O(InputStream inputStream, int i10) {
        byte[] L10 = L(inputStream, i10);
        long j6 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j6 += (L10[i11] & 255) << (i11 * 8);
        }
        return j6;
    }

    public static final void P(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    public static final void Q(String str, Throwable th2) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th2.printStackTrace();
    }

    public static LinkedHashMap R(LinkedHashMap linkedHashMap, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                linkedHashMap2.put(entry.getKey(), T(entry.getValue()));
            } catch (Exception e10) {
                P4.a.l0(abstractC5091c, 5, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), new C6122c(entry, 2), e10, 48);
            }
        }
        return linkedHashMap2;
    }

    public static ArrayList S(String str, List list) {
        Pattern compile = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$|^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)+([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$");
        AbstractC3557B.b0("compile(...)", compile);
        Pattern compile2 = Pattern.compile("^(http|https)://(.*)");
        AbstractC3557B.b0("compile(...)", compile2);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            AbstractC3557B.c0("input", str2);
            boolean matches = compile2.matcher(str2).matches();
            EnumC5090b enumC5090b = EnumC5090b.f42738Y;
            if (matches) {
                try {
                    URL url = new URL(str2);
                    P4.a.m0(Q5.c.f14433a, 4, enumC5090b, new s(str2, str, url, 7), null, false, 56);
                    str2 = url.getHost();
                } catch (MalformedURLException e10) {
                    P4.a.m0(Q5.c.f14433a, 5, enumC5090b, new C5976c(0, str2, str), e10, false, 48);
                }
            } else if (!compile.matcher(str2).matches()) {
                Locale locale = Locale.US;
                if (!AbstractC3557B.K(AbstractC6463a.j("US", locale, str2, locale, "this as java.lang.String).toLowerCase(locale)"), "localhost")) {
                    P4.a.m0(Q5.c.f14433a, 5, enumC5090b, new C5976c(1, str2, str), null, false, 56);
                    str2 = null;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static I8.r T(Object obj) {
        boolean K10 = AbstractC3557B.K(obj, Q5.b.f14432a);
        t tVar = t.f8132Y;
        if (!K10 && obj != null && !AbstractC3557B.K(obj, tVar)) {
            if (obj instanceof Boolean) {
                return new w((Boolean) obj);
            }
            if (obj instanceof Integer) {
                return new w((Number) obj);
            }
            if (obj instanceof Long) {
                return new w((Number) obj);
            }
            if (obj instanceof Float) {
                return new w((Number) obj);
            }
            if (obj instanceof Double) {
                return new w((Number) obj);
            }
            if (obj instanceof String) {
                return new w((String) obj);
            }
            if (obj instanceof Date) {
                return new w(Long.valueOf(((Date) obj).getTime()));
            }
            if (obj instanceof p) {
                return (I8.r) obj;
            }
            if (obj instanceof Iterable) {
                p pVar = new p();
                for (Object obj2 : (Iterable) obj) {
                    pVar.U(T(obj2));
                }
                return pVar;
            } else if (obj instanceof Map) {
                I8.u uVar = new I8.u();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    uVar.U(String.valueOf(entry.getKey()), T(entry.getValue()));
                }
                return uVar;
            } else if (obj instanceof I8.u) {
                return (I8.r) obj;
            } else {
                if (obj instanceof w) {
                    return (I8.r) obj;
                }
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    I8.u uVar2 = new I8.u();
                    Iterator<String> keys = jSONObject.keys();
                    AbstractC3557B.b0("keys()", keys);
                    while (keys.hasNext()) {
                        String next = keys.next();
                        uVar2.U(next, T(jSONObject.get(next)));
                    }
                    return uVar2;
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    p pVar2 = new p();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        pVar2.U(T(jSONArray.get(i10)));
                    }
                    return pVar2;
                } else {
                    return new w(obj.toString());
                }
            }
        }
        return tVar;
    }

    public static String U(int i10) {
        if (v(i10, 0)) {
            return "Blocking";
        }
        if (v(i10, 1)) {
            return "Optional";
        }
        if (v(i10, 2)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public static String V(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, long j6, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j6 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        W(byteArrayOutputStream, i10, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(G.F f6, AbstractC4326r abstractC4326r, Q q10, n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        Q q11;
        Q q12;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        Q q13;
        boolean g10;
        Object K10;
        int i14;
        int i15;
        int i16;
        int i17;
        r rVar = (r) abstractC1725n;
        rVar.X(852831187);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(f6)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                q11 = q10;
                if (rVar.g(q11)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (rVar.i(nVar)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 5851) != 1170 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    q12 = q11;
                } else {
                    if (i18 != 0) {
                        abstractC4326r4 = C4323o.f37719b;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    if (i13 != 0) {
                        q13 = null;
                    } else {
                        q13 = q11;
                    }
                    rVar.W(-2142411538);
                    g10 = rVar.g(f6);
                    K10 = rVar.K();
                    if (!g10 || K10 == C1723m.f22654Y) {
                        K10 = new C6672L(3, f6);
                        rVar.h0(K10);
                    }
                    rVar.t(false);
                    b((AbstractC6216a) K10, abstractC4326r4, q13, nVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                    abstractC4326r3 = abstractC4326r4;
                    q12 = q13;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new I(f6, abstractC4326r3, q12, nVar, i10, i11, 0);
                    return;
                }
                return;
            }
            q11 = q10;
            if ((i11 & 8) != 0) {
            }
            if ((i12 & 5851) != 1170) {
            }
            if (i18 != 0) {
            }
            if (i13 != 0) {
            }
            rVar.W(-2142411538);
            g10 = rVar.g(f6);
            K10 = rVar.K();
            if (!g10) {
            }
            K10 = new C6672L(3, f6);
            rVar.h0(K10);
            rVar.t(false);
            b((AbstractC6216a) K10, abstractC4326r4, q13, nVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            abstractC4326r3 = abstractC4326r4;
            q12 = q13;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        q11 = q10;
        if ((i11 & 8) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        if (i18 != 0) {
        }
        if (i13 != 0) {
        }
        rVar.W(-2142411538);
        g10 = rVar.g(f6);
        K10 = rVar.K();
        if (!g10) {
        }
        K10 = new C6672L(3, f6);
        rVar.h0(K10);
        rVar.t(false);
        b((AbstractC6216a) K10, abstractC4326r4, q13, nVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
        abstractC4326r3 = abstractC4326r4;
        q12 = q13;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, Q q10, n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        Q q11;
        Q q12;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i14;
        int i15;
        int i16;
        int i17;
        r rVar = (r) abstractC1725n;
        rVar.X(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(abstractC6216a)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                q11 = q10;
                if (rVar.g(q11)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (rVar.i(nVar)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                    if ((i12 & 5851) != 1170 && rVar.B()) {
                        rVar.P();
                        abstractC4326r3 = abstractC4326r2;
                        q12 = q11;
                    } else {
                        if (i18 == 0) {
                            abstractC4326r3 = C4323o.f37719b;
                        } else {
                            abstractC4326r3 = abstractC4326r2;
                        }
                        if (i13 == 0) {
                            q12 = null;
                        } else {
                            q12 = q11;
                        }
                        e(R4.b.X(rVar, -1488997347, new C6475m(q12, abstractC4326r3, nVar, AbstractC4828h.g0(abstractC6216a, rVar), 1)), rVar, 6);
                    }
                    v10 = rVar.v();
                    if (v10 == null) {
                        v10.f22739d = new I(abstractC6216a, abstractC4326r3, q12, nVar, i10, i11, 1);
                        return;
                    }
                    return;
                }
                if ((i12 & 5851) != 1170) {
                }
                if (i18 == 0) {
                }
                if (i13 == 0) {
                }
                e(R4.b.X(rVar, -1488997347, new C6475m(q12, abstractC4326r3, nVar, AbstractC4828h.g0(abstractC6216a, rVar), 1)), rVar, 6);
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            q11 = q10;
            if ((i11 & 8) != 0) {
            }
            if ((i12 & 5851) != 1170) {
            }
            if (i18 == 0) {
            }
            if (i13 == 0) {
            }
            e(R4.b.X(rVar, -1488997347, new C6475m(q12, abstractC4326r3, nVar, AbstractC4828h.g0(abstractC6216a, rVar), 1)), rVar, 6);
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        q11 = q10;
        if ((i11 & 8) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        if (i18 == 0) {
        }
        if (i13 == 0) {
        }
        e(R4.b.X(rVar, -1488997347, new C6475m(q12, abstractC4326r3, nVar, AbstractC4828h.g0(abstractC6216a, rVar), 1)), rVar, 6);
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void c(Object obj, int i10, G.N n10, n nVar, AbstractC1725n abstractC1725n, int i11) {
        r rVar = (r) abstractC1725n;
        rVar.X(-2079116560);
        rVar.W(511388516);
        boolean g10 = rVar.g(obj) | rVar.g(n10);
        Object K10 = rVar.K();
        i iVar = C1723m.f22654Y;
        if (g10 || K10 == iVar) {
            K10 = new M(obj, n10);
            rVar.h0(K10);
        }
        rVar.t(false);
        M m10 = (M) K10;
        C1720k0 c1720k0 = m10.f5442c;
        C1724m0 c1724m0 = m10.f5444e;
        C1724m0 c1724m02 = m10.f5445f;
        c1720k0.i(i10);
        Z.O o10 = b0.f4049a;
        M m11 = (M) rVar.m(o10);
        int i12 = AbstractC3893i.f35891e;
        AbstractC3893i d10 = i.d();
        try {
            AbstractC3893i j6 = d10.j();
            if (m11 != ((M) c1724m02.getValue())) {
                c1724m02.setValue(m11);
                if (m10.f5443d.h() > 0) {
                    M m12 = (M) c1724m0.getValue();
                    if (m12 != null) {
                        m12.b();
                    }
                    if (m11 != null) {
                        m11.a();
                    } else {
                        m11 = null;
                    }
                    c1724m0.setValue(m11);
                }
            }
            AbstractC3893i.p(j6);
            d10.c();
            rVar.W(1161125085);
            boolean g11 = rVar.g(m10);
            Object K11 = rVar.K();
            if (g11 || K11 == iVar) {
                K11 = new C6077x(12, m10);
                rVar.h0(K11);
            }
            rVar.t(false);
            AbstractC1734s.b(m10, (k) K11, rVar);
            A7.b.k(o10.b(m10), nVar, rVar, (i11 >> 6) & 112);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new E(obj, i10, n10, nVar, i11);
            }
        } catch (Throwable th2) {
            d10.c();
            throw th2;
        }
    }

    public static final void d(Q q10, D d10, n0 n0Var, AbstractC1725n abstractC1725n, int i10) {
        r rVar = (r) abstractC1725n;
        rVar.X(1113453182);
        View view = (View) rVar.m(Z.f6892f);
        rVar.W(1618982084);
        boolean g10 = rVar.g(n0Var) | rVar.g(q10) | rVar.g(view);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            rVar.h0(new T(q10, n0Var, d10, view));
        }
        rVar.t(false);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new U(q10, d10, n0Var, i10, 0);
        }
    }

    public static final void e(wf.o oVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        r rVar = (r) abstractC1725n;
        rVar.X(674185128);
        if ((i10 & 14) == 0) {
            if (rVar.i(oVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.B()) {
            rVar.P();
        } else {
            m1 m1Var = i0.p.f32433a;
            m mVar = (m) rVar.m(m1Var);
            G.b0 b0Var = G.b0.f5486Y;
            a0 a0Var = new a0(mVar, 1);
            i0.r rVar2 = i0.s.f32436a;
            c0 c0Var = (c0) Ad.l.Y0(new Object[]{mVar}, new i0.r(b0Var, a0Var), new C6672L(4, mVar), rVar, 4);
            A7.b.k(m1Var.b(c0Var), R4.b.X(rVar, 1863926504, new androidx.compose.foundation.layout.c(c0Var, oVar, 4)), rVar, 56);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(oVar, i10, 2);
        }
    }

    public static final void f(G.F f6, Object obj, int i10, Object obj2, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r rVar = (r) abstractC1725n;
        rVar.X(1439843069);
        if ((i11 & 14) == 0) {
            if (rVar.g(f6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (rVar.g(obj)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (rVar.e(i10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (rVar.g(obj2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && rVar.B()) {
            rVar.P();
        } else {
            ((i0.e) obj).f(obj2, R4.b.X(rVar, 980966366, new C0053y(i10, f6, obj2)), rVar, 568);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new E(f6, obj, i10, obj2, i11);
        }
    }

    public static final int g(int i10, C2104h c2104h) {
        int i11 = c2104h.f25569h0 - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = c2104h.f25567Y;
            int i14 = ((C0550e) objArr[i13]).f5496a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((C0550e) objArr[i12]).f5496a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static int h(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility == 4) {
                return 4;
            }
            if (visibility == 8) {
                return 3;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown visibility ", visibility));
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List i(G.F f6, G.N n10, C0567w c0567w) {
        Cf.e eVar;
        if (!c0567w.f5572a.l() && n10.f5446Y.isEmpty()) {
            return v.f37483Y;
        }
        ArrayList arrayList = new ArrayList();
        C2104h c2104h = c0567w.f5572a;
        if (c2104h.l()) {
            if (!c2104h.k()) {
                Object[] objArr = c2104h.f25567Y;
                int i10 = ((C0566v) objArr[0]).f5570a;
                int i11 = c2104h.f25569h0;
                if (i11 > 0) {
                    int i12 = 0;
                    do {
                        int i13 = ((C0566v) objArr[i12]).f5570a;
                        if (i13 < i10) {
                            i10 = i13;
                        }
                        i12++;
                    } while (i12 < i11);
                    if (i10 < 0) {
                        if (!c2104h.k()) {
                            Object[] objArr2 = c2104h.f25567Y;
                            int i14 = ((C0566v) objArr2[0]).f5571b;
                            int i15 = c2104h.f25569h0;
                            if (i15 > 0) {
                                int i16 = 0;
                                do {
                                    int i17 = ((C0566v) objArr2[i16]).f5571b;
                                    if (i17 > i14) {
                                        i14 = i17;
                                    }
                                    i16++;
                                } while (i16 < i15);
                                eVar = new Cf.e(i10, Math.min(i14, f6.a() - 1), 1);
                            } else {
                                eVar = new Cf.e(i10, Math.min(i14, f6.a() - 1), 1);
                            }
                        } else {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                    } else {
                        throw new IllegalArgumentException("negative minIndex".toString());
                    }
                } else if (i10 < 0) {
                }
            } else {
                throw new NoSuchElementException("MutableVector is empty.");
            }
        } else {
            eVar = g.f3113i0;
        }
        int size = n10.f5446Y.size();
        for (int i18 = 0; i18 < size; i18++) {
            M m10 = (M) n10.get(i18);
            int x10 = x(m10.f5442c.h(), f6, m10.f5440a);
            int i19 = eVar.f3106Y;
            if ((x10 > eVar.f3107Z || i19 > x10) && x10 >= 0 && x10 < f6.a()) {
                arrayList.add(Integer.valueOf(x10));
            }
        }
        int i20 = eVar.f3106Y;
        int i21 = eVar.f3107Z;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r7 == r18.f10647f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
        if ((r17.u() * 1000) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
        if (r4 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(u uVar, L2.v vVar, int i10, I2.i iVar) {
        boolean z10;
        boolean z11;
        long v10 = uVar.v();
        long j6 = v10 >>> 16;
        if (j6 != i10) {
            return false;
        }
        if ((j6 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (int) ((v10 >> 12) & 15);
        int i12 = (int) ((v10 >> 8) & 15);
        int i13 = (int) (15 & (v10 >> 4));
        int i14 = (int) ((v10 >> 1) & 7);
        if ((v10 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i13 > 7 ? !(i13 > 10 || vVar.f10648g != 2) : i13 == vVar.f10648g - 1) {
            if ((i14 == 0 || i14 == vVar.f10650i) && !z11) {
                try {
                    long A10 = uVar.A();
                    if (!z10) {
                        A10 *= vVar.f10643b;
                    }
                    iVar.f7995b = A10;
                    int N10 = N(i11, uVar);
                    if (N10 != -1 && N10 <= vVar.f10643b) {
                        if (i12 != 0) {
                            if (i12 > 11) {
                                int i15 = vVar.f10646e;
                                if (i12 != 12) {
                                    if (i12 <= 14) {
                                        int z12 = uVar.z();
                                        if (i12 == 14) {
                                            z12 *= 10;
                                        }
                                    }
                                }
                            }
                        }
                        int u10 = uVar.u();
                        int i16 = uVar.f45194b;
                        byte[] bArr = uVar.f45193a;
                        int i17 = i16 - 1;
                        int i18 = AbstractC5530A.f45131a;
                        int i19 = 0;
                        for (int i20 = uVar.f45194b; i20 < i17; i20++) {
                            i19 = AbstractC5530A.f45143m[i19 ^ (bArr[i20] & 255)];
                        }
                        if (u10 == i19) {
                            return true;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public static void k(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void l(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void m(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void n(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static int q(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        if (i10 > i12) {
            return i12;
        }
        return i10;
    }

    public static byte[] r(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x03a4, code lost:
        if (r31 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03a6, code lost:
        if (r13 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03a8, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03b7, code lost:
        if (r3.hasNext() == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03b9, code lost:
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c5, code lost:
        if (r32 != 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03c7, code lost:
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03cb, code lost:
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03ce, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator s(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i16;
        Keyframe ofObject;
        Keyframe keyframe;
        String str2;
        int i17;
        TypedValue typedValue;
        boolean z10;
        int i18;
        Keyframe keyframe2;
        int i19;
        float f6;
        int i20;
        TypedValue typedValue2;
        int i21;
        int i22;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i23 = 0;
            int i24 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i25 = 1;
            if (next == 1) {
                break;
            }
            int i26 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    H(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = H(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray O02 = y.O0(resources2, theme2, attributeSet, H3.a.f7349h);
                    if (!y.z0(xmlResourceParser2, "ordering")) {
                        i22 = 0;
                    } else {
                        i22 = O02.getInt(0, 0);
                    }
                    s(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, i22);
                    O02.recycle();
                    valueAnimator = animatorSet2;
                } else {
                    String str3 = "propertyValuesHolder";
                    if (name.equals(str3)) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i24 || eventType == i25) {
                                break;
                            } else if (eventType != i26) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals(str3)) {
                                    TypedArray O03 = y.O0(resources2, theme2, asAttributeSet, H3.a.f7350i);
                                    String s02 = y.s0(O03, xmlResourceParser2, "propertyName", i24);
                                    if (!y.z0(xmlResourceParser2, "valueType")) {
                                        i15 = 4;
                                    } else {
                                        i15 = O03.getInt(i26, 4);
                                    }
                                    int i27 = i15;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        attributeSet2 = asAttributeSet;
                                        if (next2 == i24 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = H3.a.f7351j;
                                            i17 = i27;
                                            str2 = str3;
                                            if (i17 == 4) {
                                                TypedArray O04 = y.O0(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                if (!y.z0(xmlResourceParser2, "value")) {
                                                    typedValue2 = null;
                                                } else {
                                                    typedValue2 = O04.peekValue(0);
                                                }
                                                if (typedValue2 != null && C(typedValue2.type)) {
                                                    i21 = 3;
                                                } else {
                                                    i21 = 0;
                                                }
                                                O04.recycle();
                                                i17 = i21;
                                            }
                                            TypedArray O05 = y.O0(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float f10 = -1.0f;
                                            if (y.z0(xmlResourceParser2, "fraction")) {
                                                f10 = O05.getFloat(3, -1.0f);
                                            }
                                            if (!y.z0(xmlResourceParser2, "value")) {
                                                typedValue = null;
                                            } else {
                                                typedValue = O05.peekValue(0);
                                            }
                                            if (typedValue != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (i17 == 4) {
                                                if (z10 && C(typedValue.type)) {
                                                    i18 = 3;
                                                } else {
                                                    i18 = 0;
                                                }
                                            } else {
                                                i18 = i17;
                                            }
                                            if (z10) {
                                                if (i18 != 0) {
                                                    if (i18 != 1 && i18 != 3) {
                                                        keyframe2 = null;
                                                    } else {
                                                        if (!y.z0(xmlResourceParser2, "value")) {
                                                            i20 = 0;
                                                        } else {
                                                            i20 = O05.getInt(0, 0);
                                                        }
                                                        keyframe2 = Keyframe.ofInt(f10, i20);
                                                    }
                                                } else {
                                                    if (!y.z0(xmlResourceParser2, "value")) {
                                                        f6 = 0.0f;
                                                    } else {
                                                        f6 = O05.getFloat(0, 0.0f);
                                                    }
                                                    keyframe2 = Keyframe.ofFloat(f10, f6);
                                                }
                                            } else if (i18 == 0) {
                                                keyframe2 = Keyframe.ofFloat(f10);
                                            } else {
                                                keyframe2 = Keyframe.ofInt(f10);
                                            }
                                            if (!y.z0(xmlResourceParser2, "interpolator")) {
                                                i19 = 0;
                                            } else {
                                                i19 = O05.getResourceId(1, 0);
                                            }
                                            if (i19 > 0) {
                                                keyframe2.setInterpolator(AnimationUtils.loadInterpolator(context, i19));
                                            }
                                            O05.recycle();
                                            if (keyframe2 != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(keyframe2);
                                            }
                                            xmlResourceParser.next();
                                        } else {
                                            i17 = i27;
                                            str2 = str3;
                                        }
                                        resources2 = resources;
                                        theme2 = theme;
                                        str3 = str2;
                                        asAttributeSet = attributeSet2;
                                        i27 = i17;
                                        i24 = 3;
                                    }
                                    int i28 = i27;
                                    str = str3;
                                    if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                                        Keyframe keyframe3 = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe4 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction = keyframe4.getFraction();
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe4.setFraction(1.0f);
                                            } else {
                                                int size2 = arrayList3.size();
                                                if (keyframe4.getType() == Float.TYPE) {
                                                    keyframe = Keyframe.ofFloat(1.0f);
                                                } else if (keyframe4.getType() == Integer.TYPE) {
                                                    keyframe = Keyframe.ofInt(1.0f);
                                                } else {
                                                    keyframe = Keyframe.ofObject(1.0f);
                                                }
                                                arrayList3.add(size2, keyframe);
                                                size++;
                                            }
                                        }
                                        float fraction2 = keyframe3.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe3.setFraction(0.0f);
                                            } else {
                                                if (keyframe3.getType() == Float.TYPE) {
                                                    ofObject = Keyframe.ofFloat(0.0f);
                                                } else if (keyframe3.getType() == Integer.TYPE) {
                                                    ofObject = Keyframe.ofInt(0.0f);
                                                } else {
                                                    ofObject = Keyframe.ofObject(0.0f);
                                                }
                                                arrayList3.add(0, ofObject);
                                                size++;
                                            }
                                        }
                                        Keyframe[] keyframeArr = new Keyframe[size];
                                        arrayList3.toArray(keyframeArr);
                                        int i29 = 0;
                                        while (i29 < size) {
                                            Keyframe keyframe5 = keyframeArr[i29];
                                            if (keyframe5.getFraction() < 0.0f) {
                                                if (i29 == 0) {
                                                    keyframe5.setFraction(0.0f);
                                                } else {
                                                    int i30 = size - 1;
                                                    if (i29 == i30) {
                                                        keyframe5.setFraction(1.0f);
                                                        i16 = size;
                                                    } else {
                                                        int i31 = i29;
                                                        for (int i32 = i29 + 1; i32 < i30 && keyframeArr[i32].getFraction() < 0.0f; i32++) {
                                                            i31 = i32;
                                                        }
                                                        float fraction3 = (keyframeArr[i31 + 1].getFraction() - keyframeArr[i29 - 1].getFraction()) / ((i31 - i29) + 2);
                                                        int i33 = i29;
                                                        while (i33 <= i31) {
                                                            keyframeArr[i33].setFraction(keyframeArr[i33 - 1].getFraction() + fraction3);
                                                            i33++;
                                                            size = size;
                                                        }
                                                        i16 = size;
                                                    }
                                                    i29++;
                                                    size = i16;
                                                }
                                            }
                                            i16 = size;
                                            i29++;
                                            size = i16;
                                        }
                                        i11 = 2;
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(s02, keyframeArr);
                                        i13 = 3;
                                        if (i28 == 3) {
                                            propertyValuesHolder.setEvaluator(f.f7365a);
                                        }
                                    } else {
                                        i13 = 3;
                                        i11 = 2;
                                        propertyValuesHolder = null;
                                    }
                                    i14 = 0;
                                    i12 = 1;
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = A(O03, i15, 0, 1, s02);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolder);
                                    }
                                    O03.recycle();
                                } else {
                                    attributeSet2 = asAttributeSet;
                                    i11 = i26;
                                    str = str3;
                                    i12 = i25;
                                    i13 = i24;
                                    i14 = i23;
                                }
                                xmlResourceParser.next();
                                resources2 = resources;
                                theme2 = theme;
                                xmlResourceParser2 = xmlResourceParser;
                                i23 = i14;
                                i24 = i13;
                                i25 = i12;
                                i26 = i11;
                                str3 = str;
                                asAttributeSet = attributeSet2;
                            }
                        }
                        int i34 = i25;
                        int i35 = i23;
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size3];
                            for (int i36 = i35; i36 < size3; i36++) {
                                propertyValuesHolderArr[i36] = (PropertyValuesHolder) arrayList2.get(i36);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                            valueAnimator.setValues(propertyValuesHolderArr);
                        }
                        i23 = i34;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                }
                if (animatorSet != null && i23 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
    }

    public static final Uri t(H0 h02, int i10, int i11, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(R.a.B(i11));
        builder.appendQueryParameter("appWidgetId", String.valueOf(h02.f22836b));
        builder.appendQueryParameter("viewId", String.valueOf(i10));
        builder.appendQueryParameter("viewSize", Z0.g.c(h02.f22844j));
        builder.appendQueryParameter("extraData", str);
        if (h02.f22840f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(h02.f22845k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(h02.f22846l));
        }
        return builder.build();
    }

    public static byte[] u(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = io.sentry.vendor.c.f34789d;
        int i10 = (length / 3) * 4;
        int i11 = length % 3;
        if (i11 != 1) {
            if (i11 == 2) {
                i10 += 3;
            }
        } else {
            i10 += 2;
        }
        byte[] bArr3 = new byte[i10];
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int i15 = i12 + 3;
            if (i15 > length) {
                break;
            }
            int i16 = (bArr[i12 + 2] & 255) | ((bArr[i12] & 255) << 16) | ((bArr[i12 + 1] & 255) << 8);
            bArr3[i14] = bArr2[(i16 >> 18) & 63];
            bArr3[i14 + 1] = bArr2[(i16 >> 12) & 63];
            bArr3[i14 + 2] = bArr2[(i16 >> 6) & 63];
            bArr3[i14 + 3] = bArr2[i16 & 63];
            int i17 = i14 + 4;
            i13--;
            if (i13 == 0) {
                i14 += 5;
                bArr3[i17] = 10;
                i13 = 19;
            } else {
                i14 = i17;
            }
            i12 = i15;
        }
        if (i12 == length - 1) {
            int i18 = (bArr[i12] & 255) << 4;
            bArr3[i14] = bArr2[(i18 >> 6) & 63];
            bArr3[i14 + 1] = bArr2[i18 & 63];
        } else if (i12 == length - 2) {
            int i19 = ((bArr[i12 + 1] & 255) << 2) | ((bArr[i12] & 255) << 10);
            bArr3[i14] = bArr2[(i19 >> 12) & 63];
            bArr3[i14 + 1] = bArr2[(i19 >> 6) & 63];
            bArr3[i14 + 2] = bArr2[i19 & 63];
        }
        return bArr3;
    }

    public static final boolean v(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String w(List list, String str, C0571a c0571a, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 32) != 0) {
            c0571a = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (c0571a != null) {
                sb2.append((CharSequence) c0571a.invoke(obj));
            } else if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static final int x(int i10, G.F f6, Object obj) {
        if (obj != null && f6.a() != 0) {
            if (i10 < f6.a() && AbstractC3557B.K(obj, f6.b(i10))) {
                return i10;
            }
            int c10 = f6.c(obj);
            if (c10 != -1) {
                return c10;
            }
        }
        return i10;
    }

    public static final j y(U3.q qVar) {
        AbstractC3557B.c0("<this>", qVar);
        return new j(qVar.f17450a, qVar.f17469t);
    }

    public static final C5953f z() {
        C5953f c5953f = f6519d;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        r0.N n10 = new r0.N(r0.r.f44254b);
        Wh.p pVar = new Wh.p(0);
        pVar.p(19.0f, 6.41f);
        pVar.n(17.59f, 5.0f);
        pVar.n(12.0f, 10.59f);
        pVar.n(6.41f, 5.0f);
        pVar.n(5.0f, 6.41f);
        pVar.n(10.59f, 12.0f);
        pVar.n(5.0f, 17.59f);
        pVar.n(6.41f, 19.0f);
        pVar.n(12.0f, 13.41f);
        pVar.n(17.59f, 19.0f);
        pVar.n(19.0f, 17.59f);
        E9.f.C(pVar, 13.41f, 12.0f, 19.0f, 6.41f);
        C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f6519d = c10;
        return c10;
    }
}
