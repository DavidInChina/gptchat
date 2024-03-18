package androidx.constraintlayout.widget;

import U3.u;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.statsig.androidsdk.StatsigLoggerKt;
import h1.C3298e;
import i1.d;
import i1.e;
import i1.i;
import io.sentry.android.core.AbstractC3612c;
import j.j;
import j1.l;
import j1.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import k1.c;
import k1.f;
import k1.g;
import k1.h;
import k1.n;
import k1.o;
import k1.p;
import k1.r;
import org.xmlpull.v1.XmlPullParserException;
import r9.y;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: h0  reason: collision with root package name */
    public final SparseArray f24870h0 = new SparseArray();

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f24871i0 = new ArrayList(4);

    /* renamed from: j0  reason: collision with root package name */
    public final e f24872j0 = new e();

    /* renamed from: k0  reason: collision with root package name */
    public int f24873k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public int f24874l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public int f24875m0 = Integer.MAX_VALUE;

    /* renamed from: n0  reason: collision with root package name */
    public int f24876n0 = Integer.MAX_VALUE;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f24877o0 = true;

    /* renamed from: p0  reason: collision with root package name */
    public int f24878p0 = 263;

    /* renamed from: q0  reason: collision with root package name */
    public n f24879q0 = null;

    /* renamed from: r0  reason: collision with root package name */
    public h f24880r0 = null;

    /* renamed from: s0  reason: collision with root package name */
    public int f24881s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public HashMap f24882t0 = new HashMap();

    /* renamed from: u0  reason: collision with root package name */
    public final SparseArray f24883u0 = new SparseArray();

    /* renamed from: v0  reason: collision with root package name */
    public final f f24884v0 = new f(this);

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, k1.e] */
    public static k1.e a() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f36803a = -1;
        marginLayoutParams.f36805b = -1;
        marginLayoutParams.f36807c = -1.0f;
        marginLayoutParams.f36809d = -1;
        marginLayoutParams.f36811e = -1;
        marginLayoutParams.f36813f = -1;
        marginLayoutParams.f36815g = -1;
        marginLayoutParams.f36817h = -1;
        marginLayoutParams.f36819i = -1;
        marginLayoutParams.f36821j = -1;
        marginLayoutParams.f36823k = -1;
        marginLayoutParams.f36825l = -1;
        marginLayoutParams.f36826m = -1;
        marginLayoutParams.f36827n = 0;
        marginLayoutParams.f36828o = 0.0f;
        marginLayoutParams.f36829p = -1;
        marginLayoutParams.f36830q = -1;
        marginLayoutParams.f36831r = -1;
        marginLayoutParams.f36832s = -1;
        marginLayoutParams.f36833t = -1;
        marginLayoutParams.f36834u = -1;
        marginLayoutParams.f36835v = -1;
        marginLayoutParams.f36836w = -1;
        marginLayoutParams.f36837x = -1;
        marginLayoutParams.f36838y = -1;
        marginLayoutParams.f36839z = 0.5f;
        marginLayoutParams.f36781A = 0.5f;
        marginLayoutParams.f36782B = null;
        marginLayoutParams.f36783C = 1;
        marginLayoutParams.f36784D = -1.0f;
        marginLayoutParams.f36785E = -1.0f;
        marginLayoutParams.f36786F = 0;
        marginLayoutParams.f36787G = 0;
        marginLayoutParams.f36788H = 0;
        marginLayoutParams.f36789I = 0;
        marginLayoutParams.f36790J = 0;
        marginLayoutParams.f36791K = 0;
        marginLayoutParams.f36792L = 0;
        marginLayoutParams.f36793M = 0;
        marginLayoutParams.f36794N = 1.0f;
        marginLayoutParams.f36795O = 1.0f;
        marginLayoutParams.P = -1;
        marginLayoutParams.Q = -1;
        marginLayoutParams.f36796R = -1;
        marginLayoutParams.S = false;
        marginLayoutParams.T = false;
        marginLayoutParams.f36797U = null;
        marginLayoutParams.f36798V = true;
        marginLayoutParams.f36799W = true;
        marginLayoutParams.f36800X = false;
        marginLayoutParams.f36801Y = false;
        marginLayoutParams.f36802Z = false;
        marginLayoutParams.f36804a0 = -1;
        marginLayoutParams.f36806b0 = -1;
        marginLayoutParams.f36808c0 = -1;
        marginLayoutParams.f36810d0 = -1;
        marginLayoutParams.f36812e0 = -1;
        marginLayoutParams.f36814f0 = -1;
        marginLayoutParams.f36816g0 = 0.5f;
        marginLayoutParams.f36824k0 = new d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    public final d b(View view) {
        if (view == this) {
            return this.f24872j0;
        }
        if (view == null) {
            return null;
        }
        return ((k1.e) view.getLayoutParams()).f36824k0;
    }

    public final void c(AttributeSet attributeSet, int i10) {
        e eVar = this.f24872j0;
        eVar.f32480U = this;
        f fVar = this.f24884v0;
        eVar.f32518g0 = fVar;
        eVar.f32517f0.f35973h = fVar;
        this.f24870h0.put(getId(), this);
        this.f24879q0 = null;
        boolean z10 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f36946b, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 9) {
                    this.f24873k0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f24873k0);
                } else if (index == 10) {
                    this.f24874l0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f24874l0);
                } else if (index == 7) {
                    this.f24875m0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f24875m0);
                } else if (index == 8) {
                    this.f24876n0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f24876n0);
                } else if (index == 89) {
                    this.f24878p0 = obtainStyledAttributes.getInt(index, this.f24878p0);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f24880r0 = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f24879q0 = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f24879q0 = null;
                    }
                    this.f24881s0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i12 = this.f24878p0;
        eVar.f32527p0 = i12;
        if ((i12 & 256) == 256) {
            z10 = true;
        }
        C3298e.f31705p = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k1.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k1.h, java.lang.Object] */
    public final void d(int i10) {
        char c10;
        Context context = getContext();
        ?? obj = new Object();
        obj.f36852a = new SparseArray();
        obj.f36853b = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            j jVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = '\uffff';
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = '\uffff';
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = '\uffff';
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = '\uffff';
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = '\uffff';
                                break;
                            default:
                                c10 = '\uffff';
                                break;
                        }
                        if (c10 != 0 && c10 != 1) {
                            if (c10 != 2) {
                                if (c10 != 3) {
                                    if (c10 != 4) {
                                        Log.v("ConstraintLayoutStates", "unknown tag " + name);
                                    } else {
                                        obj.a(context, xml);
                                    }
                                } else {
                                    g gVar = new g(context, xml);
                                    if (jVar != null) {
                                        ((ArrayList) jVar.f35819h0).add(gVar);
                                    }
                                }
                            } else {
                                jVar = new j(context, xml);
                                obj.f36852a.put(jVar.f35817Y, jVar);
                            }
                        }
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.f24880r0 = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f24871i0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((c) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(Separators.COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i12;
                        float f10 = i13;
                        float f11 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f6, f10, f11, f10, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f6, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f10, f11, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:0x069c, code lost:
        if (r15 != false) goto L340;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(e eVar, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        int i16;
        boolean z12;
        int i17;
        u uVar;
        int i18;
        int i19;
        f fVar;
        boolean z13;
        int i20;
        u uVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        f fVar2;
        int i21;
        int i22;
        int i23;
        f fVar3;
        boolean z18;
        u uVar3;
        int i24;
        int i25;
        boolean z19;
        boolean z20;
        int i26;
        boolean z21;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z22;
        Iterator it;
        Iterator it2;
        boolean z23;
        int i32;
        boolean z24;
        boolean z25;
        boolean z26;
        int max;
        int max2;
        e eVar2 = eVar;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i33 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.f24884v0;
        fVar4.f36841b = max3;
        fVar4.f36842c = max4;
        fVar4.f36843d = paddingWidth;
        fVar4.f36844e = i33;
        fVar4.f36845f = i11;
        fVar4.f36846g = i12;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i34 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i35 = size - paddingWidth;
        int i36 = size2 - i33;
        int i37 = fVar4.f36844e;
        int i38 = fVar4.f36843d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i13 = 0;
                } else {
                    i13 = Math.min(this.f24875m0 - i38, i35);
                    i34 = 1;
                }
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f24873k0);
                i13 = max2;
                i34 = 2;
            } else {
                i13 = 0;
                i34 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f24873k0);
            i13 = max2;
            i34 = 2;
        } else {
            i13 = i35;
            i34 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i14 = 0;
                } else {
                    i14 = Math.min(this.f24876n0 - i37, i36);
                }
                i15 = 1;
            } else if (childCount == 0) {
                max = Math.max(0, this.f24874l0);
                i14 = max;
                i15 = 2;
            } else {
                i14 = 0;
                i15 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f24874l0);
            i14 = max;
            i15 = 2;
        } else {
            i14 = i36;
            i15 = 2;
        }
        int m10 = eVar.m();
        j1.e eVar3 = eVar2.f32517f0;
        int i39 = i13;
        if (i39 != m10 || i14 != eVar.j()) {
            eVar3.f35967b = true;
        }
        eVar2.f32477N = 0;
        eVar2.f32478O = 0;
        int[] iArr = eVar2.f32509u;
        iArr[0] = this.f24875m0 - i38;
        iArr[1] = this.f24876n0 - i37;
        eVar2.Q = 0;
        eVar2.f32479R = 0;
        eVar2.x(i34);
        eVar2.z(i39);
        eVar2.y(i15);
        eVar2.w(i14);
        int i40 = this.f24873k0 - i38;
        if (i40 < 0) {
            eVar2.Q = 0;
        } else {
            eVar2.Q = i40;
        }
        int i41 = this.f24874l0 - i37;
        if (i41 < 0) {
            eVar2.f32479R = 0;
        } else {
            eVar2.f32479R = i41;
        }
        eVar2.f32521j0 = max5;
        eVar2.f32522k0 = max3;
        u uVar4 = eVar2.f32516e0;
        uVar4.getClass();
        f fVar5 = eVar2.f32518g0;
        int size3 = eVar2.f32515d0.size();
        int m11 = eVar.m();
        int j6 = eVar.j();
        if ((i10 & 128) == 128) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (i10 & 64) != 64) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            for (int i42 = 0; i42 < size3; i42++) {
                d dVar = (d) eVar2.f32515d0.get(i42);
                int[] iArr2 = dVar.f32491c0;
                if (iArr2[0] == 3) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (iArr2[1] == 3) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (z24 && z25 && dVar.f32475L > 0.0f) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((dVar.r() && z26) || ((dVar.s() && z26) || (dVar instanceof i1.g) || dVar.r() || dVar.s())) {
                    i16 = 1073741824;
                    z11 = false;
                    break;
                }
            }
        }
        i16 = 1073741824;
        if ((mode == i16 && mode2 == i16) || z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 & z11) {
            int min = Math.min(iArr[0], i35);
            int min2 = Math.min(iArr[1], i36);
            if (mode == 1073741824 && eVar.m() != min) {
                eVar2.z(min);
                eVar2.f32517f0.f35966a = true;
            }
            if (mode2 == 1073741824 && eVar.j() != min2) {
                eVar2.w(min2);
                eVar2.f32517f0.f35966a = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z27 = z10 & true;
                boolean z28 = eVar3.f35966a;
                Object obj = eVar3.f35968c;
                if (!z28 && !eVar3.f35967b) {
                    i28 = 0;
                } else {
                    e eVar4 = (e) obj;
                    Iterator it3 = eVar4.f32515d0.iterator();
                    while (it3.hasNext()) {
                        d dVar2 = (d) it3.next();
                        dVar2.f32486a = false;
                        dVar2.f32492d.n();
                        dVar2.f32493e.m();
                    }
                    i28 = 0;
                    eVar4.f32486a = false;
                    eVar4.f32492d.n();
                    eVar4.f32493e.m();
                    eVar3.f35967b = false;
                }
                eVar3.c((e) eVar3.f35969d);
                e eVar5 = (e) obj;
                eVar5.f32477N = i28;
                eVar5.f32478O = i28;
                int i43 = eVar5.i(i28);
                int i44 = eVar5.i(1);
                if (eVar3.f35966a) {
                    eVar3.d();
                }
                int n10 = eVar5.n();
                int o10 = eVar5.o();
                j1.j jVar = eVar5.f32492d;
                fVar = fVar5;
                jVar.f36000h.d(n10);
                l lVar = eVar5.f32493e;
                i19 = m11;
                lVar.f36000h.d(o10);
                eVar3.i();
                j1.g gVar = jVar.f35997e;
                i18 = j6;
                j1.g gVar2 = lVar.f35997e;
                uVar = uVar4;
                Object obj2 = eVar3.f35970e;
                i17 = size3;
                if (i43 != 2 && i44 != 2) {
                    i29 = mode2;
                } else {
                    if (z27) {
                        Iterator it4 = ((ArrayList) obj2).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            } else if (!((m) it4.next()).k()) {
                                z27 = false;
                                break;
                            }
                        }
                    }
                    if (z27 && i43 == 2) {
                        eVar5.x(1);
                        i29 = mode2;
                        eVar5.z(eVar3.e(eVar5, 0));
                        gVar.d(eVar5.m());
                    } else {
                        i29 = mode2;
                    }
                    if (z27 && i44 == 2) {
                        i30 = 1;
                        eVar5.y(1);
                        eVar5.w(eVar3.e(eVar5, 1));
                        gVar2.d(eVar5.j());
                        int[] iArr3 = eVar5.f32491c0;
                        i31 = iArr3[0];
                        if (i31 == i30 && i31 != 4) {
                            z22 = false;
                        } else {
                            int m12 = eVar5.m() + n10;
                            jVar.f36001i.d(m12);
                            gVar.d(m12 - n10);
                            eVar3.i();
                            i32 = iArr3[1];
                            if (i32 != 1 || i32 == 4) {
                                int j10 = eVar5.j() + o10;
                                lVar.f36001i.d(j10);
                                gVar2.d(j10 - o10);
                            }
                            eVar3.i();
                            z22 = true;
                        }
                        ArrayList arrayList = (ArrayList) obj2;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            m mVar = (m) it.next();
                            if (mVar.f35994b != eVar5 || mVar.f35999g) {
                                mVar.e();
                            }
                        }
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            m mVar2 = (m) it2.next();
                            if (z22 || mVar2.f35994b != eVar5) {
                                if (!mVar2.f36000h.f35984j || ((!mVar2.f36001i.f35984j && !(mVar2 instanceof j1.h)) || (!mVar2.f35997e.f35984j && !(mVar2 instanceof j1.c) && !(mVar2 instanceof j1.h)))) {
                                    z23 = false;
                                    break;
                                }
                            }
                        }
                        z23 = true;
                        eVar5.x(i43);
                        eVar5.y(i44);
                        eVar2 = eVar;
                        z13 = z23;
                        i24 = i29;
                        i25 = 1073741824;
                        i20 = 2;
                    }
                }
                i30 = 1;
                int[] iArr32 = eVar5.f32491c0;
                i31 = iArr32[0];
                if (i31 == i30) {
                }
                int m122 = eVar5.m() + n10;
                jVar.f36001i.d(m122);
                gVar.d(m122 - n10);
                eVar3.i();
                i32 = iArr32[1];
                if (i32 != 1) {
                }
                int j102 = eVar5.j() + o10;
                lVar.f36001i.d(j102);
                gVar2.d(j102 - o10);
                eVar3.i();
                z22 = true;
                ArrayList arrayList2 = (ArrayList) obj2;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z23 = true;
                eVar5.x(i43);
                eVar5.y(i44);
                eVar2 = eVar;
                z13 = z23;
                i24 = i29;
                i25 = 1073741824;
                i20 = 2;
            } else {
                uVar = uVar4;
                fVar = fVar5;
                i17 = size3;
                i19 = m11;
                i18 = j6;
                boolean z29 = eVar3.f35966a;
                Object obj3 = eVar3.f35968c;
                if (z29) {
                    e eVar6 = (e) obj3;
                    Iterator it5 = eVar6.f32515d0.iterator();
                    while (it5.hasNext()) {
                        d dVar3 = (d) it5.next();
                        dVar3.f32486a = false;
                        j1.j jVar2 = dVar3.f32492d;
                        jVar2.f35997e.f35984j = false;
                        jVar2.f35999g = false;
                        jVar2.n();
                        l lVar2 = dVar3.f32493e;
                        lVar2.f35997e.f35984j = false;
                        lVar2.f35999g = false;
                        lVar2.m();
                    }
                    i26 = 0;
                    eVar6.f32486a = false;
                    j1.j jVar3 = eVar6.f32492d;
                    jVar3.f35997e.f35984j = false;
                    jVar3.f35999g = false;
                    jVar3.n();
                    l lVar3 = eVar6.f32493e;
                    lVar3.f35997e.f35984j = false;
                    lVar3.f35999g = false;
                    lVar3.m();
                    eVar3.d();
                } else {
                    i26 = 0;
                }
                eVar3.c((e) eVar3.f35969d);
                e eVar7 = (e) obj3;
                eVar7.f32477N = i26;
                eVar7.f32478O = i26;
                eVar7.f32492d.f36000h.d(i26);
                eVar7.f32493e.f36000h.d(i26);
                i25 = 1073741824;
                eVar2 = eVar;
                if (mode == 1073741824) {
                    i27 = 1;
                    z21 = eVar2.E(i26, z10) & true;
                    i20 = 1;
                    i24 = mode2;
                } else {
                    i27 = 1;
                    z21 = true;
                    i24 = mode2;
                    i20 = 0;
                }
                if (i24 == 1073741824) {
                    z13 = z21 & eVar2.E(i27, z10);
                    i20++;
                } else {
                    z13 = z21;
                }
            }
            if (z13) {
                if (mode == i25) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (i24 == i25) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                eVar2.A(z19, z20);
            }
        } else {
            uVar = uVar4;
            fVar = fVar5;
            i17 = size3;
            i19 = m11;
            i18 = j6;
            i20 = 0;
            z13 = false;
        }
        if (!z13 || i20 != 2) {
            if (i17 > 0) {
                int size4 = eVar2.f32515d0.size();
                f fVar6 = eVar2.f32518g0;
                int i45 = 0;
                while (i45 < size4) {
                    d dVar4 = (d) eVar2.f32515d0.get(i45);
                    if ((dVar4 instanceof i1.h) || (dVar4.f32492d.f35997e.f35984j && dVar4.f32493e.f35997e.f35984j)) {
                        uVar3 = uVar;
                    } else {
                        int i46 = dVar4.i(0);
                        int i47 = dVar4.i(1);
                        if (i46 == 3 && dVar4.f32498j != 1 && i47 == 3 && dVar4.f32499k != 1) {
                            uVar3 = uVar;
                        } else {
                            uVar3 = uVar;
                            uVar3.H(fVar6, dVar4, false);
                        }
                    }
                    i45++;
                    uVar = uVar3;
                }
                uVar2 = uVar;
                ConstraintLayout constraintLayout = fVar6.f36840a;
                int childCount2 = constraintLayout.getChildCount();
                for (int i48 = 0; i48 < childCount2; i48++) {
                    constraintLayout.getChildAt(i48);
                }
                ArrayList arrayList3 = constraintLayout.f24871i0;
                int size5 = arrayList3.size();
                if (size5 > 0) {
                    for (int i49 = 0; i49 < size5; i49++) {
                        ((c) arrayList3.get(i49)).getClass();
                    }
                }
            } else {
                uVar2 = uVar;
            }
            int i50 = eVar2.f32527p0;
            int size6 = ((ArrayList) uVar2.f17492Z).size();
            int i51 = i19;
            int i52 = i18;
            if (i17 > 0) {
                uVar2.Q(eVar2, i51, i52);
            }
            if (size6 > 0) {
                int[] iArr4 = eVar2.f32491c0;
                if (iArr4[0] == 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (iArr4[1] == 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                int max7 = Math.max(eVar.m(), ((e) uVar2.f17494i0).Q);
                int max8 = Math.max(eVar.j(), ((e) uVar2.f17494i0).f32479R);
                int i53 = 0;
                boolean z30 = false;
                while (i53 < size6) {
                    d dVar5 = (d) ((ArrayList) uVar2.f17492Z).get(i53);
                    if (!(dVar5 instanceof i1.g)) {
                        i23 = i50;
                        fVar3 = fVar;
                    } else {
                        int m13 = dVar5.m();
                        int j11 = dVar5.j();
                        i23 = i50;
                        fVar3 = fVar;
                        int m14 = dVar5.m();
                        boolean H6 = z30 | uVar2.H(fVar3, dVar5, true);
                        int j12 = dVar5.j();
                        if (m14 != m13) {
                            dVar5.z(m14);
                            if (z15 && dVar5.n() + dVar5.f32473J > max7) {
                                max7 = Math.max(max7, dVar5.h(4).c() + dVar5.n() + dVar5.f32473J);
                            }
                            H6 = true;
                        }
                        if (j12 != j11) {
                            dVar5.w(j12);
                            if (z16 && dVar5.o() + dVar5.f32474K > max8) {
                                max8 = Math.max(max8, dVar5.h(5).c() + dVar5.o() + dVar5.f32474K);
                            }
                            z18 = true;
                        } else {
                            z18 = H6;
                        }
                        z30 = ((i1.g) dVar5).f32569l0 | z18;
                    }
                    i53++;
                    fVar = fVar3;
                    i50 = i23;
                }
                int i54 = i50;
                f fVar7 = fVar;
                int i55 = 0;
                for (int i56 = 2; i55 < i56; i56 = 2) {
                    boolean z31 = z30;
                    int i57 = 0;
                    while (i57 < size6) {
                        d dVar6 = (d) ((ArrayList) uVar2.f17492Z).get(i57);
                        if (((dVar6 instanceof i) && !(dVar6 instanceof i1.g)) || (dVar6 instanceof i1.h) || dVar6.f32481V == 8 || ((dVar6.f32492d.f35997e.f35984j && dVar6.f32493e.f35997e.f35984j) || (dVar6 instanceof i1.g))) {
                            fVar2 = fVar7;
                            i22 = size6;
                            i21 = i55;
                        } else {
                            int m15 = dVar6.m();
                            int j13 = dVar6.j();
                            i22 = size6;
                            int i58 = dVar6.P;
                            i21 = i55;
                            z31 |= uVar2.H(fVar7, dVar6, true);
                            int m16 = dVar6.m();
                            fVar2 = fVar7;
                            int j14 = dVar6.j();
                            if (m16 != m15) {
                                dVar6.z(m16);
                                if (z15 && dVar6.n() + dVar6.f32473J > max7) {
                                    max7 = Math.max(max7, dVar6.h(4).c() + dVar6.n() + dVar6.f32473J);
                                }
                                z31 = true;
                            }
                            if (j14 != j13) {
                                dVar6.w(j14);
                                if (z16 && dVar6.o() + dVar6.f32474K > max8) {
                                    max8 = Math.max(max8, dVar6.h(5).c() + dVar6.o() + dVar6.f32474K);
                                }
                                z31 = true;
                            }
                            if (dVar6.f32511w && i58 != dVar6.P) {
                                z31 = true;
                            }
                        }
                        i57++;
                        size6 = i22;
                        i55 = i21;
                        fVar7 = fVar2;
                    }
                    f fVar8 = fVar7;
                    int i59 = size6;
                    int i60 = i55;
                    if (z31) {
                        uVar2.Q(eVar2, i51, i52);
                        z30 = false;
                    } else {
                        z30 = z31;
                    }
                    i55 = i60 + 1;
                    size6 = i59;
                    fVar7 = fVar8;
                }
                if (z30) {
                    uVar2.Q(eVar2, i51, i52);
                    if (eVar.m() < max7) {
                        eVar2.z(max7);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (eVar.j() < max8) {
                        eVar2.w(max8);
                    }
                    uVar2.Q(eVar2, i51, i52);
                }
                i50 = i54;
            }
            eVar2.f32527p0 = i50;
            if ((i50 & 256) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            C3298e.f31705p = z14;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f24877o0 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, k1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i10;
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f36803a = -1;
        marginLayoutParams.f36805b = -1;
        marginLayoutParams.f36807c = -1.0f;
        marginLayoutParams.f36809d = -1;
        marginLayoutParams.f36811e = -1;
        marginLayoutParams.f36813f = -1;
        marginLayoutParams.f36815g = -1;
        marginLayoutParams.f36817h = -1;
        marginLayoutParams.f36819i = -1;
        marginLayoutParams.f36821j = -1;
        marginLayoutParams.f36823k = -1;
        marginLayoutParams.f36825l = -1;
        marginLayoutParams.f36826m = -1;
        marginLayoutParams.f36827n = 0;
        marginLayoutParams.f36828o = 0.0f;
        marginLayoutParams.f36829p = -1;
        marginLayoutParams.f36830q = -1;
        marginLayoutParams.f36831r = -1;
        marginLayoutParams.f36832s = -1;
        marginLayoutParams.f36833t = -1;
        marginLayoutParams.f36834u = -1;
        marginLayoutParams.f36835v = -1;
        marginLayoutParams.f36836w = -1;
        marginLayoutParams.f36837x = -1;
        marginLayoutParams.f36838y = -1;
        marginLayoutParams.f36839z = 0.5f;
        marginLayoutParams.f36781A = 0.5f;
        marginLayoutParams.f36782B = null;
        marginLayoutParams.f36783C = 1;
        marginLayoutParams.f36784D = -1.0f;
        marginLayoutParams.f36785E = -1.0f;
        marginLayoutParams.f36786F = 0;
        marginLayoutParams.f36787G = 0;
        marginLayoutParams.f36788H = 0;
        marginLayoutParams.f36789I = 0;
        marginLayoutParams.f36790J = 0;
        marginLayoutParams.f36791K = 0;
        marginLayoutParams.f36792L = 0;
        marginLayoutParams.f36793M = 0;
        marginLayoutParams.f36794N = 1.0f;
        marginLayoutParams.f36795O = 1.0f;
        marginLayoutParams.P = -1;
        marginLayoutParams.Q = -1;
        marginLayoutParams.f36796R = -1;
        marginLayoutParams.S = false;
        marginLayoutParams.T = false;
        marginLayoutParams.f36797U = null;
        marginLayoutParams.f36798V = true;
        marginLayoutParams.f36799W = true;
        marginLayoutParams.f36800X = false;
        marginLayoutParams.f36801Y = false;
        marginLayoutParams.f36802Z = false;
        marginLayoutParams.f36804a0 = -1;
        marginLayoutParams.f36806b0 = -1;
        marginLayoutParams.f36808c0 = -1;
        marginLayoutParams.f36810d0 = -1;
        marginLayoutParams.f36812e0 = -1;
        marginLayoutParams.f36814f0 = -1;
        marginLayoutParams.f36816g0 = 0.5f;
        marginLayoutParams.f36824k0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f36946b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            int i12 = k1.d.f36780a.get(index);
            switch (i12) {
                case 1:
                    marginLayoutParams.f36796R = obtainStyledAttributes.getInt(index, marginLayoutParams.f36796R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36826m);
                    marginLayoutParams.f36826m = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f36826m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f36827n = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36827n);
                    break;
                case 4:
                    float f6 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f36828o) % 360.0f;
                    marginLayoutParams.f36828o = f6;
                    if (f6 < 0.0f) {
                        marginLayoutParams.f36828o = (360.0f - f6) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f36803a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f36803a);
                    break;
                case 6:
                    marginLayoutParams.f36805b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f36805b);
                    break;
                case 7:
                    marginLayoutParams.f36807c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f36807c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36809d);
                    marginLayoutParams.f36809d = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f36809d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36811e);
                    marginLayoutParams.f36811e = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f36811e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36813f);
                    marginLayoutParams.f36813f = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f36813f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36815g);
                    marginLayoutParams.f36815g = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f36815g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36817h);
                    marginLayoutParams.f36817h = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f36817h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36819i);
                    marginLayoutParams.f36819i = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f36819i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36821j);
                    marginLayoutParams.f36821j = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f36821j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36823k);
                    marginLayoutParams.f36823k = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f36823k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36825l);
                    marginLayoutParams.f36825l = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f36825l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36829p);
                    marginLayoutParams.f36829p = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f36829p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36830q);
                    marginLayoutParams.f36830q = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f36830q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36831r);
                    marginLayoutParams.f36831r = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f36831r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f36832s);
                    marginLayoutParams.f36832s = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f36832s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f36833t = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36833t);
                    break;
                case 22:
                    marginLayoutParams.f36834u = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36834u);
                    break;
                case 23:
                    marginLayoutParams.f36835v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36835v);
                    break;
                case 24:
                    marginLayoutParams.f36836w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36836w);
                    break;
                case 25:
                    marginLayoutParams.f36837x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36837x);
                    break;
                case 26:
                    marginLayoutParams.f36838y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36838y);
                    break;
                case 27:
                    marginLayoutParams.S = obtainStyledAttributes.getBoolean(index, marginLayoutParams.S);
                    break;
                case 28:
                    marginLayoutParams.T = obtainStyledAttributes.getBoolean(index, marginLayoutParams.T);
                    break;
                case 29:
                    marginLayoutParams.f36839z = obtainStyledAttributes.getFloat(index, marginLayoutParams.f36839z);
                    break;
                case 30:
                    marginLayoutParams.f36781A = obtainStyledAttributes.getFloat(index, marginLayoutParams.f36781A);
                    break;
                case 31:
                    int i13 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f36788H = i13;
                    if (i13 == 1) {
                        AbstractC3612c.c("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i14 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f36789I = i14;
                    if (i14 == 1) {
                        AbstractC3612c.c("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f36790J = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36790J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f36790J) == -2) {
                            marginLayoutParams.f36790J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f36792L = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36792L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f36792L) == -2) {
                            marginLayoutParams.f36792L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f36794N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f36794N));
                    marginLayoutParams.f36788H = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f36791K = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36791K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f36791K) == -2) {
                            marginLayoutParams.f36791K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f36793M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f36793M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f36793M) == -2) {
                            marginLayoutParams.f36793M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f36795O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f36795O));
                    marginLayoutParams.f36789I = 2;
                    break;
                default:
                    switch (i12) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            marginLayoutParams.f36782B = string;
                            marginLayoutParams.f36783C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = marginLayoutParams.f36782B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i10 = 0;
                                } else {
                                    String substring = marginLayoutParams.f36782B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        marginLayoutParams.f36783C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        marginLayoutParams.f36783C = 1;
                                    }
                                    i10 = indexOf + 1;
                                }
                                int indexOf2 = marginLayoutParams.f36782B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = marginLayoutParams.f36782B.substring(i10, indexOf2);
                                    String substring3 = marginLayoutParams.f36782B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (marginLayoutParams.f36783C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = marginLayoutParams.f36782B.substring(i10);
                                    if (substring4.length() > 0) {
                                        Float.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 45:
                            marginLayoutParams.f36784D = obtainStyledAttributes.getFloat(index, marginLayoutParams.f36784D);
                            continue;
                        case 46:
                            marginLayoutParams.f36785E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f36785E);
                            continue;
                        case 47:
                            marginLayoutParams.f36786F = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case y.f44626f /* 48 */:
                            marginLayoutParams.f36787G = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.P);
                            continue;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.Q);
                            continue;
                        case 51:
                            marginLayoutParams.f36797U = obtainStyledAttributes.getString(index);
                            continue;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f24876n0;
    }

    public int getMaxWidth() {
        return this.f24875m0;
    }

    public int getMinHeight() {
        return this.f24874l0;
    }

    public int getMinWidth() {
        return this.f24873k0;
    }

    public int getOptimizationLevel() {
        return this.f24872j0.f32527p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            k1.e eVar = (k1.e) childAt.getLayoutParams();
            d dVar = eVar.f36824k0;
            if (childAt.getVisibility() != 8 || eVar.f36801Y || eVar.f36802Z || isInEditMode) {
                int n10 = dVar.n();
                int o10 = dVar.o();
                childAt.layout(n10, o10, dVar.m() + n10, dVar.j() + o10);
            }
        }
        ArrayList arrayList = this.f24871i0;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((c) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        e eVar;
        boolean z11;
        int i12;
        e eVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        float f6;
        int i17;
        int i18;
        int i19;
        int i20;
        float f10;
        d dVar;
        d dVar2;
        d dVar3;
        ArrayList arrayList;
        int i21;
        ArrayList arrayList2;
        View view;
        int i22;
        View view2;
        String resourceName;
        int id2;
        d dVar4;
        String str;
        ConstraintLayout constraintLayout = this;
        int i23 = 0;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e eVar3 = constraintLayout.f24872j0;
        eVar3.f32519h0 = z10;
        if (constraintLayout.f24877o0) {
            constraintLayout.f24877o0 = false;
            int childCount = getChildCount();
            int i24 = 0;
            while (true) {
                if (i24 < childCount) {
                    if (constraintLayout.getChildAt(i24).isLayoutRequested()) {
                        z11 = true;
                        break;
                    }
                    i24++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                boolean isInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                for (int i25 = 0; i25 < childCount2; i25++) {
                    d b10 = constraintLayout.b(constraintLayout.getChildAt(i25));
                    if (b10 != null) {
                        b10.t();
                    }
                }
                SparseArray sparseArray = constraintLayout.f24870h0;
                if (isInEditMode) {
                    for (int i26 = 0; i26 < childCount2; i26++) {
                        View childAt = constraintLayout.getChildAt(i26);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.f24882t0 == null) {
                                    constraintLayout.f24882t0 = new HashMap();
                                }
                                int indexOf = resourceName.indexOf(Separators.SLASH);
                                if (indexOf != -1) {
                                    str = resourceName.substring(indexOf + 1);
                                } else {
                                    str = resourceName;
                                }
                                constraintLayout.f24882t0.put(str, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id2 = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id2 != 0) {
                            View view3 = (View) sparseArray.get(id2);
                            if (view3 == null && (view3 = constraintLayout.findViewById(id2)) != null && view3 != constraintLayout && view3.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view3);
                            }
                            if (view3 != constraintLayout) {
                                if (view3 == null) {
                                    dVar4 = null;
                                } else {
                                    dVar4 = ((k1.e) view3.getLayoutParams()).f36824k0;
                                }
                                dVar4.f32482W = resourceName;
                            }
                        }
                        dVar4 = eVar3;
                        dVar4.f32482W = resourceName;
                    }
                }
                if (constraintLayout.f24881s0 != -1) {
                    for (int i27 = 0; i27 < childCount2; i27++) {
                        constraintLayout.getChildAt(i27).getId();
                    }
                }
                n nVar = constraintLayout.f24879q0;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                eVar3.f32515d0.clear();
                ArrayList arrayList3 = constraintLayout.f24871i0;
                int size = arrayList3.size();
                if (size > 0) {
                    int i28 = 0;
                    while (i28 < size) {
                        c cVar = (c) arrayList3.get(i28);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f36778l0);
                        }
                        i1.j jVar = cVar.f36777k0;
                        if (jVar == null) {
                            arrayList = arrayList3;
                            i21 = size;
                        } else {
                            jVar.f32590e0 = i23;
                            Arrays.fill(jVar.f32589d0, (Object) null);
                            int i29 = i23;
                            while (i29 < cVar.f36775i0) {
                                int i30 = cVar.f36774h0[i29];
                                View view4 = (View) constraintLayout.f24870h0.get(i30);
                                if (view4 == null) {
                                    Integer valueOf2 = Integer.valueOf(i30);
                                    HashMap hashMap = cVar.f36779m0;
                                    String str2 = (String) hashMap.get(valueOf2);
                                    view2 = view4;
                                    int d10 = cVar.d(constraintLayout, str2);
                                    arrayList2 = arrayList3;
                                    if (d10 != 0) {
                                        cVar.f36774h0[i29] = d10;
                                        hashMap.put(Integer.valueOf(d10), str2);
                                        view = (View) constraintLayout.f24870h0.get(d10);
                                        if (view != null) {
                                            i1.j jVar2 = cVar.f36777k0;
                                            d b11 = constraintLayout.b(view);
                                            jVar2.getClass();
                                            if (b11 != jVar2 && b11 != null) {
                                                int i31 = jVar2.f32590e0 + 1;
                                                d[] dVarArr = jVar2.f32589d0;
                                                i22 = size;
                                                if (i31 > dVarArr.length) {
                                                    jVar2.f32589d0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                                }
                                                d[] dVarArr2 = jVar2.f32589d0;
                                                int i32 = jVar2.f32590e0;
                                                dVarArr2[i32] = b11;
                                                jVar2.f32590e0 = i32 + 1;
                                                i29++;
                                                size = i22;
                                                arrayList3 = arrayList2;
                                            }
                                        }
                                        i22 = size;
                                        i29++;
                                        size = i22;
                                        arrayList3 = arrayList2;
                                    }
                                } else {
                                    view2 = view4;
                                    arrayList2 = arrayList3;
                                }
                                view = view2;
                                if (view != null) {
                                }
                                i22 = size;
                                i29++;
                                size = i22;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            i21 = size;
                            cVar.f36777k0.a();
                        }
                        i28++;
                        size = i21;
                        arrayList3 = arrayList;
                        i23 = 0;
                    }
                }
                for (int i33 = 0; i33 < childCount2; i33++) {
                    constraintLayout.getChildAt(i33);
                }
                SparseArray sparseArray2 = constraintLayout.f24883u0;
                sparseArray2.clear();
                sparseArray2.put(0, eVar3);
                sparseArray2.put(getId(), eVar3);
                for (int i34 = 0; i34 < childCount2; i34++) {
                    View childAt2 = constraintLayout.getChildAt(i34);
                    sparseArray2.put(childAt2.getId(), constraintLayout.b(childAt2));
                }
                int i35 = 0;
                while (i35 < childCount2) {
                    View childAt3 = constraintLayout.getChildAt(i35);
                    d b12 = constraintLayout.b(childAt3);
                    if (b12 != null) {
                        k1.e eVar4 = (k1.e) childAt3.getLayoutParams();
                        eVar3.f32515d0.add(b12);
                        d dVar5 = b12.f32472I;
                        if (dVar5 != null) {
                            ((e) dVar5).f32515d0.remove(b12);
                            b12.f32472I = null;
                        }
                        b12.f32472I = eVar3;
                        eVar4.a();
                        b12.f32481V = childAt3.getVisibility();
                        b12.f32480U = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).f(b12, eVar3.f32519h0);
                        }
                        if (eVar4.f36801Y) {
                            i1.h hVar = (i1.h) b12;
                            int i36 = eVar4.f36818h0;
                            int i37 = eVar4.f36820i0;
                            float f11 = eVar4.f36822j0;
                            int i38 = (f11 > (-1.0f) ? 1 : (f11 == (-1.0f) ? 0 : -1));
                            if (i38 != 0) {
                                if (i38 > 0) {
                                    hVar.f32584d0 = f11;
                                    hVar.f32585e0 = -1;
                                    hVar.f32586f0 = -1;
                                }
                            } else if (i36 != -1) {
                                if (i36 > -1) {
                                    hVar.f32584d0 = -1.0f;
                                    hVar.f32585e0 = i36;
                                    hVar.f32586f0 = -1;
                                }
                            } else if (i37 != -1 && i37 > -1) {
                                hVar.f32584d0 = -1.0f;
                                hVar.f32585e0 = -1;
                                hVar.f32586f0 = i37;
                            }
                        } else {
                            int i39 = eVar4.f36804a0;
                            int i40 = eVar4.f36806b0;
                            int i41 = eVar4.f36808c0;
                            int i42 = eVar4.f36810d0;
                            i13 = childCount2;
                            int i43 = eVar4.f36812e0;
                            int i44 = eVar4.f36814f0;
                            float f12 = eVar4.f36816g0;
                            int i45 = eVar4.f36826m;
                            eVar2 = eVar3;
                            if (i45 != -1) {
                                d dVar6 = (d) sparseArray2.get(i45);
                                if (dVar6 != null) {
                                    float f13 = eVar4.f36828o;
                                    b12.p(7, dVar6, 7, eVar4.f36827n, 0);
                                    b12.f32510v = f13;
                                }
                            } else {
                                int i46 = -1;
                                if (i39 != -1) {
                                    d dVar7 = (d) sparseArray2.get(i39);
                                    if (dVar7 != null) {
                                        b12.p(2, dVar7, 2, ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, i43);
                                    }
                                } else {
                                    if (i40 != -1) {
                                        d dVar8 = (d) sparseArray2.get(i40);
                                        if (dVar8 != null) {
                                            b12.p(2, dVar8, 4, ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, i43);
                                        }
                                    }
                                    if (i41 == i46) {
                                        d dVar9 = (d) sparseArray2.get(i41);
                                        if (dVar9 != null) {
                                            b12.p(4, dVar9, 2, ((ViewGroup.MarginLayoutParams) eVar4).rightMargin, i44);
                                        }
                                    } else if (i42 != i46 && (dVar3 = (d) sparseArray2.get(i42)) != null) {
                                        b12.p(4, dVar3, 4, ((ViewGroup.MarginLayoutParams) eVar4).rightMargin, i44);
                                    }
                                    i18 = eVar4.f36817h;
                                    if (i18 == -1) {
                                        d dVar10 = (d) sparseArray2.get(i18);
                                        if (dVar10 != null) {
                                            b12.p(3, dVar10, 3, ((ViewGroup.MarginLayoutParams) eVar4).topMargin, eVar4.f36834u);
                                        }
                                    } else {
                                        int i47 = eVar4.f36819i;
                                        if (i47 != -1 && (dVar2 = (d) sparseArray2.get(i47)) != null) {
                                            b12.p(3, dVar2, 5, ((ViewGroup.MarginLayoutParams) eVar4).topMargin, eVar4.f36834u);
                                        }
                                    }
                                    i19 = eVar4.f36821j;
                                    if (i19 == -1) {
                                        d dVar11 = (d) sparseArray2.get(i19);
                                        if (dVar11 != null) {
                                            b12.p(5, dVar11, 3, ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin, eVar4.f36836w);
                                        }
                                    } else {
                                        int i48 = eVar4.f36823k;
                                        if (i48 != -1 && (dVar = (d) sparseArray2.get(i48)) != null) {
                                            b12.p(5, dVar, 5, ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin, eVar4.f36836w);
                                        }
                                    }
                                    i20 = eVar4.f36825l;
                                    if (i20 != -1) {
                                        View view5 = (View) sparseArray.get(i20);
                                        d dVar12 = (d) sparseArray2.get(eVar4.f36825l);
                                        if (dVar12 != null && view5 != null && (view5.getLayoutParams() instanceof k1.e)) {
                                            k1.e eVar5 = (k1.e) view5.getLayoutParams();
                                            eVar4.f36800X = true;
                                            eVar5.f36800X = true;
                                            b12.h(6).b(dVar12.h(6), 0, -1, true);
                                            b12.f32511w = true;
                                            eVar5.f36824k0.f32511w = true;
                                            b12.h(3).h();
                                            b12.h(5).h();
                                        }
                                    }
                                    if (f12 >= 0.0f) {
                                        b12.S = f12;
                                    }
                                    f10 = eVar4.f36781A;
                                    if (f10 >= 0.0f) {
                                        b12.T = f10;
                                    }
                                }
                                i46 = -1;
                                if (i41 == i46) {
                                }
                                i18 = eVar4.f36817h;
                                if (i18 == -1) {
                                }
                                i19 = eVar4.f36821j;
                                if (i19 == -1) {
                                }
                                i20 = eVar4.f36825l;
                                if (i20 != -1) {
                                }
                                if (f12 >= 0.0f) {
                                }
                                f10 = eVar4.f36781A;
                                if (f10 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i17 = eVar4.P) != -1 || eVar4.Q != -1)) {
                                int i49 = eVar4.Q;
                                b12.f32477N = i17;
                                b12.f32478O = i49;
                            }
                            if (!eVar4.f36798V) {
                                if (((ViewGroup.MarginLayoutParams) eVar4).width == -1) {
                                    if (eVar4.S) {
                                        b12.x(3);
                                    } else {
                                        b12.x(4);
                                    }
                                    b12.h(2).f32461e = ((ViewGroup.MarginLayoutParams) eVar4).leftMargin;
                                    b12.h(4).f32461e = ((ViewGroup.MarginLayoutParams) eVar4).rightMargin;
                                } else {
                                    b12.x(3);
                                    b12.z(0);
                                }
                            } else {
                                b12.x(1);
                                b12.z(((ViewGroup.MarginLayoutParams) eVar4).width);
                                if (((ViewGroup.MarginLayoutParams) eVar4).width == -2) {
                                    b12.x(2);
                                }
                            }
                            if (!eVar4.f36799W) {
                                i14 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar4).height == -1) {
                                    if (eVar4.T) {
                                        b12.y(3);
                                    } else {
                                        b12.y(4);
                                    }
                                    b12.h(3).f32461e = ((ViewGroup.MarginLayoutParams) eVar4).topMargin;
                                    b12.h(5).f32461e = ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin;
                                } else {
                                    b12.y(3);
                                    b12.w(0);
                                }
                            } else {
                                i14 = -1;
                                b12.y(1);
                                b12.w(((ViewGroup.MarginLayoutParams) eVar4).height);
                                if (((ViewGroup.MarginLayoutParams) eVar4).height == -2) {
                                    b12.y(2);
                                }
                            }
                            String str3 = eVar4.f36782B;
                            if (str3 != null && str3.length() != 0) {
                                int length = str3.length();
                                int indexOf3 = str3.indexOf(44);
                                if (indexOf3 > 0 && indexOf3 < length - 1) {
                                    String substring = str3.substring(0, indexOf3);
                                    if (substring.equalsIgnoreCase("W")) {
                                        i15 = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        i15 = 1;
                                    } else {
                                        i15 = i14;
                                    }
                                    i16 = indexOf3 + 1;
                                } else {
                                    i15 = i14;
                                    i16 = 0;
                                }
                                int indexOf4 = str3.indexOf(58);
                                if (indexOf4 >= 0 && indexOf4 < length - 1) {
                                    String substring2 = str3.substring(i16, indexOf4);
                                    String substring3 = str3.substring(indexOf4 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (i15 == 1) {
                                                    f6 = Math.abs(parseFloat2 / parseFloat);
                                                } else {
                                                    f6 = Math.abs(parseFloat / parseFloat2);
                                                }
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    f6 = 0.0f;
                                } else {
                                    String substring4 = str3.substring(i16);
                                    if (substring4.length() > 0) {
                                        f6 = Float.parseFloat(substring4);
                                    }
                                    f6 = 0.0f;
                                }
                                if (f6 > 0.0f) {
                                    b12.f32475L = f6;
                                    b12.f32476M = i15;
                                }
                            } else {
                                b12.f32475L = 0.0f;
                            }
                            float f14 = eVar4.f36784D;
                            float[] fArr = b12.f32485Z;
                            fArr[0] = f14;
                            fArr[1] = eVar4.f36785E;
                            b12.f32483X = eVar4.f36786F;
                            b12.f32484Y = eVar4.f36787G;
                            int i50 = eVar4.f36788H;
                            int i51 = eVar4.f36790J;
                            int i52 = eVar4.f36792L;
                            float f15 = eVar4.f36794N;
                            b12.f32498j = i50;
                            b12.f32501m = i51;
                            if (i52 == Integer.MAX_VALUE) {
                                i52 = 0;
                            }
                            b12.f32502n = i52;
                            b12.f32503o = f15;
                            if (f15 > 0.0f && f15 < 1.0f && i50 == 0) {
                                b12.f32498j = 2;
                            }
                            int i53 = eVar4.f36789I;
                            int i54 = eVar4.f36791K;
                            int i55 = eVar4.f36793M;
                            float f16 = eVar4.f36795O;
                            b12.f32499k = i53;
                            b12.f32504p = i54;
                            if (i55 == Integer.MAX_VALUE) {
                                i55 = 0;
                            }
                            b12.f32505q = i55;
                            b12.f32506r = f16;
                            if (f16 > 0.0f && f16 < 1.0f && i53 == 0) {
                                b12.f32499k = 2;
                            }
                            i35++;
                            constraintLayout = this;
                            childCount2 = i13;
                            eVar3 = eVar2;
                        }
                    }
                    eVar2 = eVar3;
                    i13 = childCount2;
                    i35++;
                    constraintLayout = this;
                    childCount2 = i13;
                    eVar3 = eVar2;
                }
            }
            eVar = eVar3;
            if (z11) {
                u uVar = eVar.f32516e0;
                ((ArrayList) uVar.f17492Z).clear();
                int size2 = eVar.f32515d0.size();
                for (int i56 = 0; i56 < size2; i56++) {
                    d dVar13 = (d) eVar.f32515d0.get(i56);
                    int[] iArr = dVar13.f32491c0;
                    int i57 = iArr[0];
                    if (i57 == 3 || i57 == 4 || (i12 = iArr[1]) == 3 || i12 == 4) {
                        ((ArrayList) uVar.f17492Z).add(dVar13);
                    }
                }
                eVar.f32517f0.f35966a = true;
            }
        } else {
            eVar = eVar3;
        }
        e(eVar, this.f24878p0, i10, i11);
        int m10 = eVar.m();
        int j6 = eVar.j();
        boolean z12 = eVar.f32528q0;
        boolean z13 = eVar.f32529r0;
        f fVar = this.f24884v0;
        int i58 = fVar.f36844e;
        int min = Math.min(this.f24875m0, View.resolveSizeAndState(m10 + fVar.f36843d, i10, 0) & 16777215);
        int min2 = Math.min(this.f24876n0, View.resolveSizeAndState(j6 + i58, i11, 0) & 16777215);
        if (z12) {
            min |= 16777216;
        }
        if (z13) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d b10 = b(view);
        if ((view instanceof p) && !(b10 instanceof i1.h)) {
            k1.e eVar = (k1.e) view.getLayoutParams();
            i1.h hVar = new i1.h();
            eVar.f36824k0 = hVar;
            eVar.f36801Y = true;
            hVar.C(eVar.f36796R);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.g();
            ((k1.e) view.getLayoutParams()).f36802Z = true;
            ArrayList arrayList = this.f24871i0;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f24870h0.put(view.getId(), view);
        this.f24877o0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f24870h0.remove(view.getId());
        d b10 = b(view);
        this.f24872j0.f32515d0.remove(b10);
        b10.f32472I = null;
        this.f24871i0.remove(view);
        this.f24877o0 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f24877o0 = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f24879q0 = nVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.f24870h0;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f24876n0) {
            return;
        }
        this.f24876n0 = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f24875m0) {
            return;
        }
        this.f24875m0 = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f24874l0) {
            return;
        }
        this.f24874l0 = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f24873k0) {
            return;
        }
        this.f24873k0 = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        h hVar = this.f24880r0;
        if (hVar != null) {
            hVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        boolean z10;
        this.f24878p0 = i10;
        this.f24872j0.f32527p0 = i10;
        if ((i10 & 256) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3298e.f31705p = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(attributeSet, i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, k1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f36803a = -1;
        marginLayoutParams.f36805b = -1;
        marginLayoutParams.f36807c = -1.0f;
        marginLayoutParams.f36809d = -1;
        marginLayoutParams.f36811e = -1;
        marginLayoutParams.f36813f = -1;
        marginLayoutParams.f36815g = -1;
        marginLayoutParams.f36817h = -1;
        marginLayoutParams.f36819i = -1;
        marginLayoutParams.f36821j = -1;
        marginLayoutParams.f36823k = -1;
        marginLayoutParams.f36825l = -1;
        marginLayoutParams.f36826m = -1;
        marginLayoutParams.f36827n = 0;
        marginLayoutParams.f36828o = 0.0f;
        marginLayoutParams.f36829p = -1;
        marginLayoutParams.f36830q = -1;
        marginLayoutParams.f36831r = -1;
        marginLayoutParams.f36832s = -1;
        marginLayoutParams.f36833t = -1;
        marginLayoutParams.f36834u = -1;
        marginLayoutParams.f36835v = -1;
        marginLayoutParams.f36836w = -1;
        marginLayoutParams.f36837x = -1;
        marginLayoutParams.f36838y = -1;
        marginLayoutParams.f36839z = 0.5f;
        marginLayoutParams.f36781A = 0.5f;
        marginLayoutParams.f36782B = null;
        marginLayoutParams.f36783C = 1;
        marginLayoutParams.f36784D = -1.0f;
        marginLayoutParams.f36785E = -1.0f;
        marginLayoutParams.f36786F = 0;
        marginLayoutParams.f36787G = 0;
        marginLayoutParams.f36788H = 0;
        marginLayoutParams.f36789I = 0;
        marginLayoutParams.f36790J = 0;
        marginLayoutParams.f36791K = 0;
        marginLayoutParams.f36792L = 0;
        marginLayoutParams.f36793M = 0;
        marginLayoutParams.f36794N = 1.0f;
        marginLayoutParams.f36795O = 1.0f;
        marginLayoutParams.P = -1;
        marginLayoutParams.Q = -1;
        marginLayoutParams.f36796R = -1;
        marginLayoutParams.S = false;
        marginLayoutParams.T = false;
        marginLayoutParams.f36797U = null;
        marginLayoutParams.f36798V = true;
        marginLayoutParams.f36799W = true;
        marginLayoutParams.f36800X = false;
        marginLayoutParams.f36801Y = false;
        marginLayoutParams.f36802Z = false;
        marginLayoutParams.f36804a0 = -1;
        marginLayoutParams.f36806b0 = -1;
        marginLayoutParams.f36808c0 = -1;
        marginLayoutParams.f36810d0 = -1;
        marginLayoutParams.f36812e0 = -1;
        marginLayoutParams.f36814f0 = -1;
        marginLayoutParams.f36816g0 = 0.5f;
        marginLayoutParams.f36824k0 = new d();
        return marginLayoutParams;
    }
}
