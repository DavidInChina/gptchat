package n;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import t1.AbstractC5656b;
import t1.AbstractC5657c;

/* renamed from: n.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4697h extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f39531A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f39532B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f39533C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f39534D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f39535E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f39536F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f39537G;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4698i f39538a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f39539b;

    /* renamed from: c  reason: collision with root package name */
    public int f39540c;

    /* renamed from: d  reason: collision with root package name */
    public int f39541d;

    /* renamed from: e  reason: collision with root package name */
    public int f39542e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f39543f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable[] f39544g;

    /* renamed from: h  reason: collision with root package name */
    public int f39545h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f39546i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f39547j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f39548k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f39549l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f39550m;

    /* renamed from: n  reason: collision with root package name */
    public int f39551n;

    /* renamed from: o  reason: collision with root package name */
    public int f39552o;

    /* renamed from: p  reason: collision with root package name */
    public int f39553p;

    /* renamed from: q  reason: collision with root package name */
    public int f39554q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f39555r;

    /* renamed from: s  reason: collision with root package name */
    public int f39556s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f39557t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f39558u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f39559v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f39560w;

    /* renamed from: x  reason: collision with root package name */
    public int f39561x;

    /* renamed from: y  reason: collision with root package name */
    public int f39562y;

    /* renamed from: z  reason: collision with root package name */
    public int f39563z;

    public AbstractC4697h(AbstractC4697h abstractC4697h, AbstractC4698i abstractC4698i, Resources resources) {
        Resources resources2;
        int i10;
        this.f39546i = false;
        this.f39549l = false;
        this.f39560w = true;
        this.f39562y = 0;
        this.f39563z = 0;
        this.f39538a = abstractC4698i;
        Rect rect = null;
        if (resources != null) {
            resources2 = resources;
        } else if (abstractC4697h != null) {
            resources2 = abstractC4697h.f39539b;
        } else {
            resources2 = null;
        }
        this.f39539b = resources2;
        if (abstractC4697h != null) {
            i10 = abstractC4697h.f39540c;
        } else {
            i10 = 0;
        }
        int i11 = AbstractC4698i.f39564r0;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f39540c = i10;
        if (abstractC4697h != null) {
            this.f39541d = abstractC4697h.f39541d;
            this.f39542e = abstractC4697h.f39542e;
            this.f39558u = true;
            this.f39559v = true;
            this.f39546i = abstractC4697h.f39546i;
            this.f39549l = abstractC4697h.f39549l;
            this.f39560w = abstractC4697h.f39560w;
            this.f39561x = abstractC4697h.f39561x;
            this.f39562y = abstractC4697h.f39562y;
            this.f39563z = abstractC4697h.f39563z;
            this.f39531A = abstractC4697h.f39531A;
            this.f39532B = abstractC4697h.f39532B;
            this.f39533C = abstractC4697h.f39533C;
            this.f39534D = abstractC4697h.f39534D;
            this.f39535E = abstractC4697h.f39535E;
            this.f39536F = abstractC4697h.f39536F;
            this.f39537G = abstractC4697h.f39537G;
            if (abstractC4697h.f39540c == i10) {
                if (abstractC4697h.f39547j) {
                    this.f39548k = abstractC4697h.f39548k != null ? new Rect(abstractC4697h.f39548k) : rect;
                    this.f39547j = true;
                }
                if (abstractC4697h.f39550m) {
                    this.f39551n = abstractC4697h.f39551n;
                    this.f39552o = abstractC4697h.f39552o;
                    this.f39553p = abstractC4697h.f39553p;
                    this.f39554q = abstractC4697h.f39554q;
                    this.f39550m = true;
                }
            }
            if (abstractC4697h.f39555r) {
                this.f39556s = abstractC4697h.f39556s;
                this.f39555r = true;
            }
            if (abstractC4697h.f39557t) {
                this.f39557t = true;
            }
            Drawable[] drawableArr = abstractC4697h.f39544g;
            this.f39544g = new Drawable[drawableArr.length];
            this.f39545h = abstractC4697h.f39545h;
            SparseArray sparseArray = abstractC4697h.f39543f;
            if (sparseArray != null) {
                this.f39543f = sparseArray.clone();
            } else {
                this.f39543f = new SparseArray(this.f39545h);
            }
            int i12 = this.f39545h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f39543f.put(i13, constantState);
                    } else {
                        this.f39544g[i13] = drawableArr[i13];
                    }
                }
            }
            return;
        }
        this.f39544g = new Drawable[10];
        this.f39545h = 0;
    }

    public final int a(Drawable drawable) {
        int i10 = this.f39545h;
        if (i10 >= this.f39544g.length) {
            int i11 = i10 + 10;
            AbstractC4700k abstractC4700k = (AbstractC4700k) this;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = abstractC4700k.f39544g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            abstractC4700k.f39544g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(abstractC4700k.f39578H, 0, iArr, 0, i10);
            abstractC4700k.f39578H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f39538a);
        this.f39544g[i10] = drawable;
        this.f39545h++;
        this.f39542e = drawable.getChangingConfigurations() | this.f39542e;
        this.f39555r = false;
        this.f39557t = false;
        this.f39548k = null;
        this.f39547j = false;
        this.f39550m = false;
        this.f39558u = false;
        return i10;
    }

    public final void b() {
        this.f39550m = true;
        c();
        int i10 = this.f39545h;
        Drawable[] drawableArr = this.f39544g;
        this.f39552o = -1;
        this.f39551n = -1;
        this.f39554q = 0;
        this.f39553p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f39551n) {
                this.f39551n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f39552o) {
                this.f39552o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f39553p) {
                this.f39553p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f39554q) {
                this.f39554q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f39543f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f39543f.keyAt(i10);
                Drawable[] drawableArr = this.f39544g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f39543f.valueAt(i10)).newDrawable(this.f39539b);
                AbstractC5657c.b(newDrawable, this.f39561x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f39538a);
                drawableArr[keyAt] = mutate;
            }
            this.f39543f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f39545h;
        Drawable[] drawableArr = this.f39544g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (AbstractC5656b.b(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f39543f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f39544g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f39543f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f39543f.valueAt(indexOfKey)).newDrawable(this.f39539b);
        AbstractC5657c.b(newDrawable, this.f39561x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f39538a);
        this.f39544g[i10] = mutate;
        this.f39543f.removeAt(indexOfKey);
        if (this.f39543f.size() == 0) {
            this.f39543f = null;
        }
        return mutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f39541d | this.f39542e;
    }
}
