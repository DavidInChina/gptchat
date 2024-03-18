package f8;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public j f29665a;

    /* renamed from: b  reason: collision with root package name */
    public Z7.a f29666b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f29667c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f29668d;

    /* renamed from: e  reason: collision with root package name */
    public final ColorStateList f29669e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f29670f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f29671g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f29672h;

    /* renamed from: i  reason: collision with root package name */
    public final float f29673i;

    /* renamed from: j  reason: collision with root package name */
    public float f29674j;

    /* renamed from: k  reason: collision with root package name */
    public float f29675k;

    /* renamed from: l  reason: collision with root package name */
    public int f29676l;

    /* renamed from: m  reason: collision with root package name */
    public float f29677m;

    /* renamed from: n  reason: collision with root package name */
    public float f29678n;

    /* renamed from: o  reason: collision with root package name */
    public final float f29679o;

    /* renamed from: p  reason: collision with root package name */
    public final int f29680p;

    /* renamed from: q  reason: collision with root package name */
    public int f29681q;

    /* renamed from: r  reason: collision with root package name */
    public int f29682r;

    /* renamed from: s  reason: collision with root package name */
    public final int f29683s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f29684t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint.Style f29685u;

    public f(j jVar) {
        this.f29667c = null;
        this.f29668d = null;
        this.f29669e = null;
        this.f29670f = null;
        this.f29671g = PorterDuff.Mode.SRC_IN;
        this.f29672h = null;
        this.f29673i = 1.0f;
        this.f29674j = 1.0f;
        this.f29676l = 255;
        this.f29677m = 0.0f;
        this.f29678n = 0.0f;
        this.f29679o = 0.0f;
        this.f29680p = 0;
        this.f29681q = 0;
        this.f29682r = 0;
        this.f29683s = 0;
        this.f29684t = false;
        this.f29685u = Paint.Style.FILL_AND_STROKE;
        this.f29665a = jVar;
        this.f29666b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f29692j0 = true;
        return gVar;
    }

    public f(f fVar) {
        this.f29667c = null;
        this.f29668d = null;
        this.f29669e = null;
        this.f29670f = null;
        this.f29671g = PorterDuff.Mode.SRC_IN;
        this.f29672h = null;
        this.f29673i = 1.0f;
        this.f29674j = 1.0f;
        this.f29676l = 255;
        this.f29677m = 0.0f;
        this.f29678n = 0.0f;
        this.f29679o = 0.0f;
        this.f29680p = 0;
        this.f29681q = 0;
        this.f29682r = 0;
        this.f29683s = 0;
        this.f29684t = false;
        this.f29685u = Paint.Style.FILL_AND_STROKE;
        this.f29665a = fVar.f29665a;
        this.f29666b = fVar.f29666b;
        this.f29675k = fVar.f29675k;
        this.f29667c = fVar.f29667c;
        this.f29668d = fVar.f29668d;
        this.f29671g = fVar.f29671g;
        this.f29670f = fVar.f29670f;
        this.f29676l = fVar.f29676l;
        this.f29673i = fVar.f29673i;
        this.f29682r = fVar.f29682r;
        this.f29680p = fVar.f29680p;
        this.f29684t = fVar.f29684t;
        this.f29674j = fVar.f29674j;
        this.f29677m = fVar.f29677m;
        this.f29678n = fVar.f29678n;
        this.f29679o = fVar.f29679o;
        this.f29681q = fVar.f29681q;
        this.f29683s = fVar.f29683s;
        this.f29669e = fVar.f29669e;
        this.f29685u = fVar.f29685u;
        if (fVar.f29672h != null) {
            this.f29672h = new Rect(fVar.f29672h);
        }
    }
}
