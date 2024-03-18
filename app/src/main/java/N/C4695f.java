package n;

import H3.p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import o.AbstractC4864b;
import o.AbstractC4865c;
import org.xmlpull.v1.XmlPullParserException;
import q.X0;
import r9.y;

/* renamed from: n.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4695f extends AbstractC4701l {

    /* renamed from: u0  reason: collision with root package name */
    public C4691b f39524u0;

    /* renamed from: v0  reason: collision with root package name */
    public AbstractC4694e f39525v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f39526w0 = -1;

    /* renamed from: x0  reason: collision with root package name */
    public int f39527x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f39528y0;

    public C4695f(C4691b c4691b, Resources resources) {
        this.f39569j0 = 255;
        this.f39571l0 = -1;
        d(new C4691b(c4691b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x026f, code lost:
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0276, code lost:
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4695f e(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlResourceParser xmlResourceParser) {
        int depth;
        Drawable drawable;
        long j6;
        int next;
        Drawable drawable2;
        int next2;
        Context context2 = context;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            C4695f c4695f = new C4695f(null, null);
            TypedArray O02 = y.O0(resources2, theme2, attributeSet, AbstractC4865c.f40409a);
            int i10 = 1;
            c4695f.setVisible(O02.getBoolean(1, true), true);
            C4691b c4691b = c4695f.f39524u0;
            c4691b.f39541d |= AbstractC4864b.b(O02);
            int i11 = 2;
            c4691b.f39546i = O02.getBoolean(2, c4691b.f39546i);
            int i12 = 3;
            c4691b.f39549l = O02.getBoolean(3, c4691b.f39549l);
            c4691b.f39562y = O02.getInt(4, c4691b.f39562y);
            c4691b.f39563z = O02.getInt(5, c4691b.f39563z);
            ?? r10 = 0;
            c4695f.setDither(O02.getBoolean(0, c4691b.f39560w));
            AbstractC4697h abstractC4697h = c4695f.f39565Y;
            if (resources2 != null) {
                abstractC4697h.f39539b = resources2;
                int i13 = resources.getDisplayMetrics().densityDpi;
                if (i13 == 0) {
                    i13 = 160;
                }
                int i14 = abstractC4697h.f39540c;
                abstractC4697h.f39540c = i13;
                if (i14 != i13) {
                    abstractC4697h.f39550m = false;
                    abstractC4697h.f39547j = false;
                }
            } else {
                abstractC4697h.getClass();
            }
            O02.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            while (true) {
                int next3 = xmlResourceParser.next();
                if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                    break;
                } else if (next3 == i11 && depth <= depth2) {
                    if (xmlResourceParser.getName().equals("item")) {
                        ?? O03 = y.O0(resources2, theme2, attributeSet, AbstractC4865c.f40410b);
                        int resourceId = O03.getResourceId(r10, r10);
                        int resourceId2 = O03.getResourceId(i10, -1);
                        if (resourceId2 > 0) {
                            drawable2 = X0.d().f(context2, resourceId2);
                        } else {
                            drawable2 = null;
                        }
                        O03.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i15 = r10 == true ? 1 : 0;
                        boolean z10 = r10 == true ? 1 : 0;
                        boolean z11 = r10 == true ? 1 : 0;
                        boolean z12 = r10 == true ? 1 : 0;
                        boolean z13 = r10 == true ? 1 : 0;
                        int i16 = i15;
                        for (int i17 = i16; i17 < attributeCount; i17++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i17);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i18 = i16 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i17, r10)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i16] = attributeNameResource;
                                i16 = i18;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i16);
                        if (drawable2 == null) {
                            do {
                                next2 = xmlResourceParser.next();
                            } while (next2 == 4);
                            if (next2 == 2) {
                                if (xmlResourceParser.getName().equals("vector")) {
                                    drawable2 = new p();
                                    drawable2.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                                } else {
                                    drawable2 = AbstractC4864b.a(resources2, xmlResourceParser, attributeSet, theme2);
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        if (drawable2 != null) {
                            C4691b c4691b2 = c4695f.f39524u0;
                            int a5 = c4691b2.a(drawable2);
                            c4691b2.f39578H[a5] = trimStateSet;
                            c4691b2.f39518J.e(a5, Integer.valueOf(resourceId));
                        } else {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                    } else if (xmlResourceParser.getName().equals("transition")) {
                        ?? O04 = y.O0(resources2, theme2, attributeSet, AbstractC4865c.f40411c);
                        int resourceId3 = O04.getResourceId(2, -1);
                        int resourceId4 = O04.getResourceId(1, -1);
                        int i19 = r10 == true ? 1 : 0;
                        int i20 = r10 == true ? 1 : 0;
                        int i21 = r10 == true ? 1 : 0;
                        int i22 = r10 == true ? 1 : 0;
                        int i23 = r10 == true ? 1 : 0;
                        int resourceId5 = O04.getResourceId(i19, -1);
                        if (resourceId5 > 0) {
                            drawable = X0.d().f(context2, resourceId5);
                        } else {
                            drawable = null;
                        }
                        boolean z14 = O04.getBoolean(3, r10);
                        O04.recycle();
                        if (drawable == null) {
                            while (true) {
                                next = xmlResourceParser.next();
                                if (next != 4) {
                                    break;
                                }
                            }
                            if (next == 2) {
                                if (xmlResourceParser.getName().equals("animated-vector")) {
                                    drawable = new H3.e(context2);
                                    drawable.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                                } else {
                                    drawable = AbstractC4864b.a(resources2, xmlResourceParser, attributeSet, theme2);
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        if (drawable != null) {
                            if (resourceId3 == -1 || resourceId4 == -1) {
                                break;
                            }
                            C4691b c4691b3 = c4695f.f39524u0;
                            int a10 = c4691b3.a(drawable);
                            long j10 = resourceId3;
                            long j11 = resourceId4;
                            long j12 = (j10 << 32) | j11;
                            if (z14) {
                                j6 = 8589934592L;
                            } else {
                                j6 = 0;
                            }
                            long j13 = a10;
                            c4691b3.f39517I.a(j12, Long.valueOf(j13 | j6));
                            if (z14) {
                                c4691b3.f39517I.a((j11 << 32) | j10, Long.valueOf(j13 | 4294967296L | j6));
                            }
                            context2 = context;
                            theme2 = theme;
                            resources2 = resources;
                            i10 = 1;
                            r10 = 0;
                            i11 = 2;
                            i12 = 3;
                        } else {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                    } else {
                        context2 = context;
                        theme2 = theme;
                        resources2 = resources;
                    }
                    i10 = 1;
                    r10 = r10;
                    i11 = 2;
                    i12 = 3;
                }
            }
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // n.AbstractC4698i
    public final void d(C4691b c4691b) {
        this.f39565Y = c4691b;
        int i10 = this.f39571l0;
        if (i10 >= 0) {
            Drawable d10 = c4691b.d(i10);
            this.f39567h0 = d10;
            if (d10 != null) {
                b(d10);
            }
        }
        this.f39568i0 = null;
        this.f39579s0 = c4691b;
        this.f39524u0 = c4691b;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // n.AbstractC4698i, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC4694e abstractC4694e = this.f39525v0;
        if (abstractC4694e != null) {
            abstractC4694e.q();
            this.f39525v0 = null;
            c(this.f39526w0);
            this.f39526w0 = -1;
            this.f39527x0 = -1;
        }
    }

    @Override // n.AbstractC4701l, n.AbstractC4698i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f39528y0) {
            super.mutate();
            C4691b c4691b = this.f39524u0;
            c4691b.f39517I = c4691b.f39517I.clone();
            c4691b.f39518J = c4691b.f39518J.clone();
            this.f39528y0 = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
        if (c(r4) != false) goto L52;
     */
    @Override // n.AbstractC4701l, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        AbstractC4694e abstractC4694e;
        C4691b c4691b = this.f39524u0;
        int[][] iArr2 = c4691b.f39578H;
        int i10 = c4691b.f39545h;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = c4691b.f39578H;
            int i12 = c4691b.f39545h;
            i11 = 0;
            while (true) {
                if (i11 < i12) {
                    if (StateSet.stateSetMatches(iArr4[i11], iArr3)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
        }
        int i13 = this.f39571l0;
        if (i11 != i13) {
            AbstractC4694e abstractC4694e2 = this.f39525v0;
            if (abstractC4694e2 != null) {
                if (i11 != this.f39526w0) {
                    if (i11 == this.f39527x0 && abstractC4694e2.c()) {
                        abstractC4694e2.o();
                        this.f39526w0 = this.f39527x0;
                        this.f39527x0 = i11;
                    } else {
                        i13 = this.f39526w0;
                        abstractC4694e2.q();
                    }
                }
                z11 = true;
            }
            this.f39525v0 = null;
            this.f39527x0 = -1;
            this.f39526w0 = -1;
            C4691b c4691b2 = this.f39524u0;
            int e10 = c4691b2.e(i13);
            int e11 = c4691b2.e(i11);
            if (e11 != 0 && e10 != 0) {
                long j6 = e11 | (e10 << 32);
                int longValue = (int) ((Long) c4691b2.f39517I.e(j6)).longValue();
                if (longValue >= 0) {
                    if ((((Long) c4691b2.f39517I.e(j6)).longValue() & 8589934592L) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c(longValue);
                    Drawable drawable = this.f39567h0;
                    if (drawable instanceof AnimationDrawable) {
                        if ((((Long) c4691b2.f39517I.e(j6)).longValue() & 4294967296L) != 0) {
                            z11 = true;
                        }
                        abstractC4694e = new C4692c((AnimationDrawable) drawable, z11, z10);
                    } else if (drawable instanceof H3.e) {
                        abstractC4694e = new C4690a((H3.e) drawable, 1);
                    } else if (drawable instanceof Animatable) {
                        abstractC4694e = new C4690a((Animatable) drawable, 0);
                    }
                    abstractC4694e.p();
                    this.f39525v0 = abstractC4694e;
                    this.f39527x0 = i13;
                    this.f39526w0 = i11;
                    z11 = true;
                }
            }
        }
        Drawable drawable2 = this.f39567h0;
        if (drawable2 != null) {
            return z11 | drawable2.setState(iArr);
        }
        return z11;
    }

    @Override // n.AbstractC4698i, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        AbstractC4694e abstractC4694e = this.f39525v0;
        if (abstractC4694e != null && (visible || z11)) {
            if (z10) {
                abstractC4694e.p();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
