package E4;

import B2.E;
import H0.C0672c0;
import U3.u;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s3.z;
import v4.l;
import w4.C6119a;
import y4.AbstractC6541a;
import y4.q;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract class b implements x4.e, AbstractC6541a {

    /* renamed from: B  reason: collision with root package name */
    public BlurMaskFilter f4432B;

    /* renamed from: e  reason: collision with root package name */
    public final C6119a f4437e;

    /* renamed from: f  reason: collision with root package name */
    public final C6119a f4438f;

    /* renamed from: g  reason: collision with root package name */
    public final C6119a f4439g;

    /* renamed from: h  reason: collision with root package name */
    public final C6119a f4440h;

    /* renamed from: o  reason: collision with root package name */
    public final l f4447o;

    /* renamed from: p  reason: collision with root package name */
    public final e f4448p;

    /* renamed from: q  reason: collision with root package name */
    public final u f4449q;

    /* renamed from: r  reason: collision with root package name */
    public final y4.h f4450r;

    /* renamed from: s  reason: collision with root package name */
    public b f4451s;

    /* renamed from: t  reason: collision with root package name */
    public b f4452t;

    /* renamed from: u  reason: collision with root package name */
    public List f4453u;

    /* renamed from: w  reason: collision with root package name */
    public final q f4455w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4456x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4457y;

    /* renamed from: z  reason: collision with root package name */
    public C6119a f4458z;

    /* renamed from: a  reason: collision with root package name */
    public final Path f4433a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f4434b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f4435c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    public final C6119a f4436d = new Paint(1);

    /* renamed from: i  reason: collision with root package name */
    public final RectF f4441i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    public final RectF f4442j = new RectF();

    /* renamed from: k  reason: collision with root package name */
    public final RectF f4443k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    public final RectF f4444l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public final RectF f4445m = new RectF();

    /* renamed from: n  reason: collision with root package name */
    public final Matrix f4446n = new Matrix();

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f4454v = new ArrayList();

    /* renamed from: A  reason: collision with root package name */
    public float f4431A = 0.0f;

    /* JADX WARN: Type inference failed for: r0v3, types: [w4.a, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v6, types: [w4.a, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r4v0, types: [w4.a, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r9v3, types: [y4.h, y4.e] */
    public b(l lVar, e eVar) {
        boolean z10 = true;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f4437e = new C6119a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f4438f = new C6119a(mode2);
        ?? paint = new Paint(1);
        this.f4439g = paint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        ?? paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(mode3));
        this.f4440h = paint2;
        this.f4456x = true;
        this.f4447o = lVar;
        this.f4448p = eVar;
        if (eVar.f4490u == 3) {
            paint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        C4.e eVar2 = eVar.f4478i;
        eVar2.getClass();
        q qVar = new q(eVar2);
        this.f4455w = qVar;
        qVar.b(this);
        List list = eVar.f4477h;
        if (list != null && !list.isEmpty()) {
            u uVar = new u(list);
            this.f4449q = uVar;
            for (y4.e eVar3 : (List) uVar.f17492Z) {
                eVar3.a(this);
            }
            for (y4.e eVar4 : (List) this.f4449q.f17493h0) {
                d(eVar4);
                eVar4.a(this);
            }
        }
        e eVar5 = this.f4448p;
        if (!eVar5.f4489t.isEmpty()) {
            ?? eVar6 = new y4.e(eVar5.f4489t);
            this.f4450r = eVar6;
            eVar6.f50721b = true;
            eVar6.a(new AbstractC6541a() { // from class: E4.a
                @Override // y4.AbstractC6541a
                public final void a() {
                    boolean z11;
                    b bVar = b.this;
                    if (bVar.f4450r.h() == 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != bVar.f4456x) {
                        bVar.f4456x = z11;
                        bVar.f4447o.invalidateSelf();
                    }
                }
            });
            z10 = ((Float) this.f4450r.d()).floatValue() != 1.0f ? false : z10;
            if (z10 != this.f4456x) {
                this.f4456x = z10;
                this.f4447o.invalidateSelf();
            }
            d(this.f4450r);
        } else if (true != this.f4456x) {
            this.f4456x = true;
            this.f4447o.invalidateSelf();
        }
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f4447o.invalidateSelf();
    }

    @Override // x4.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f4441i.set(0.0f, 0.0f, 0.0f, 0.0f);
        g();
        Matrix matrix2 = this.f4446n;
        matrix2.set(matrix);
        if (z10) {
            List list = this.f4453u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f4453u.get(size)).f4455w.d());
                }
            } else {
                b bVar = this.f4452t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f4455w.d());
                }
            }
        }
        matrix2.preConcat(this.f4455w.d());
    }

    public final void d(y4.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f4454v.add(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    @Override // x4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        boolean z10;
        float f6;
        C6119a c6119a;
        char c10;
        Integer num;
        if (this.f4456x) {
            e eVar = this.f4448p;
            if (!eVar.f4491v) {
                g();
                Matrix matrix2 = this.f4434b;
                matrix2.reset();
                matrix2.set(matrix);
                int i12 = 1;
                for (int size = this.f4453u.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f4453u.get(size)).f4455w.d());
                }
                q qVar = this.f4455w;
                y4.e eVar2 = qVar.f50759j;
                if (eVar2 != null && (num = (Integer) eVar2.d()) != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 100;
                }
                int i13 = (int) ((((i10 / 255.0f) * i11) / 100.0f) * 255.0f);
                if (this.f4451s != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !l()) {
                    matrix2.preConcat(qVar.d());
                    i(canvas, matrix2, i13);
                    m();
                    return;
                }
                RectF rectF = this.f4441i;
                c(rectF, matrix2, false);
                int i14 = 3;
                if (this.f4451s != null && eVar.f4490u != 3) {
                    RectF rectF2 = this.f4444l;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f4451s.c(rectF2, matrix, true);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(qVar.d());
                RectF rectF3 = this.f4443k;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean l10 = l();
                Path path = this.f4433a;
                u uVar = this.f4449q;
                int i15 = 2;
                if (!l10) {
                    f6 = 0.0f;
                } else {
                    int size2 = ((List) uVar.f17494i0).size();
                    int i16 = 0;
                    while (true) {
                        if (i16 < size2) {
                            D4.f fVar = (D4.f) ((List) uVar.f17494i0).get(i16);
                            Path path2 = (Path) ((y4.e) ((List) uVar.f17492Z).get(i16)).d();
                            if (path2 != null) {
                                path.set(path2);
                                path.transform(matrix2);
                                int f10 = AbstractC6708l.f(fVar.f3366a);
                                if (f10 != 0) {
                                    if (f10 == i12) {
                                        break;
                                    } else if (f10 != i15) {
                                        if (f10 == i14) {
                                            break;
                                        }
                                        RectF rectF4 = this.f4445m;
                                        path.computeBounds(rectF4, false);
                                        if (i16 != 0) {
                                            rectF3.set(rectF4);
                                        } else {
                                            rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                        }
                                    }
                                }
                                if (fVar.f3369d) {
                                    break;
                                }
                                RectF rectF42 = this.f4445m;
                                path.computeBounds(rectF42, false);
                                if (i16 != 0) {
                                }
                            }
                            i16++;
                            i12 = 1;
                            i14 = 3;
                            i15 = 2;
                        } else if (!rectF.intersect(rectF3)) {
                            f6 = 0.0f;
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                    f6 = 0.0f;
                }
                RectF rectF5 = this.f4442j;
                rectF5.set(f6, f6, canvas.getWidth(), canvas.getHeight());
                Matrix matrix3 = this.f4435c;
                canvas.getMatrix(matrix3);
                if (!matrix3.isIdentity()) {
                    matrix3.invert(matrix3);
                    matrix3.mapRect(rectF5);
                }
                if (!rectF.intersect(rectF5)) {
                    rectF.set(f6, f6, f6, f6);
                }
                if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                    C6119a c6119a2 = this.f4436d;
                    c6119a2.setAlpha(255);
                    C0672c0 c0672c0 = I4.g.f8055a;
                    canvas.saveLayer(rectF, c6119a2);
                    h(canvas);
                    i(canvas, matrix2, i13);
                    if (l()) {
                        C6119a c6119a3 = this.f4437e;
                        canvas.saveLayer(rectF, c6119a3);
                        if (Build.VERSION.SDK_INT < 28) {
                            h(canvas);
                        }
                        for (int i17 = 0; i17 < ((List) uVar.f17494i0).size(); i17++) {
                            D4.f fVar2 = (D4.f) ((List) uVar.f17494i0).get(i17);
                            y4.e eVar3 = (y4.e) ((List) uVar.f17492Z).get(i17);
                            y4.e eVar4 = (y4.e) ((List) uVar.f17493h0).get(i17);
                            int f11 = AbstractC6708l.f(fVar2.f3366a);
                            C6119a c6119a4 = this.f4438f;
                            boolean z11 = fVar2.f3369d;
                            if (f11 != 0) {
                                if (f11 != 1) {
                                    if (f11 != 2) {
                                        if (f11 == 3 && !((List) uVar.f17492Z).isEmpty()) {
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 < ((List) uVar.f17494i0).size()) {
                                                    if (((D4.f) ((List) uVar.f17494i0).get(i18)).f3366a != 4) {
                                                        break;
                                                    }
                                                    i18++;
                                                } else {
                                                    c6119a2.setAlpha(255);
                                                    canvas.drawRect(rectF, c6119a2);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (z11) {
                                        C0672c0 c0672c02 = I4.g.f8055a;
                                        canvas.saveLayer(rectF, c6119a3);
                                        canvas.drawRect(rectF, c6119a2);
                                        c6119a4.setAlpha((int) (((Integer) eVar4.d()).intValue() * 2.55f));
                                        path.set((Path) eVar3.d());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, c6119a4);
                                        canvas.restore();
                                    } else {
                                        C0672c0 c0672c03 = I4.g.f8055a;
                                        canvas.saveLayer(rectF, c6119a3);
                                        path.set((Path) eVar3.d());
                                        path.transform(matrix2);
                                        c6119a2.setAlpha((int) (((Integer) eVar4.d()).intValue() * 2.55f));
                                        canvas.drawPath(path, c6119a2);
                                        canvas.restore();
                                    }
                                    c10 = '\u00ff';
                                } else {
                                    if (i17 == 0) {
                                        c6119a2.setColor(-16777216);
                                        c10 = '\u00ff';
                                        c6119a2.setAlpha(255);
                                        canvas.drawRect(rectF, c6119a2);
                                    } else {
                                        c10 = '\u00ff';
                                    }
                                    if (z11) {
                                        C0672c0 c0672c04 = I4.g.f8055a;
                                        canvas.saveLayer(rectF, c6119a4);
                                        canvas.drawRect(rectF, c6119a2);
                                        c6119a4.setAlpha((int) (((Integer) eVar4.d()).intValue() * 2.55f));
                                        path.set((Path) eVar3.d());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, c6119a4);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) eVar3.d());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, c6119a4);
                                    }
                                }
                            } else {
                                c10 = '\u00ff';
                                if (z11) {
                                    C0672c0 c0672c05 = I4.g.f8055a;
                                    canvas.saveLayer(rectF, c6119a2);
                                    canvas.drawRect(rectF, c6119a2);
                                    path.set((Path) eVar3.d());
                                    path.transform(matrix2);
                                    c6119a2.setAlpha((int) (((Integer) eVar4.d()).intValue() * 2.55f));
                                    canvas.drawPath(path, c6119a4);
                                    canvas.restore();
                                } else {
                                    path.set((Path) eVar3.d());
                                    path.transform(matrix2);
                                    c6119a2.setAlpha((int) (((Integer) eVar4.d()).intValue() * 2.55f));
                                    canvas.drawPath(path, c6119a2);
                                }
                            }
                        }
                        canvas.restore();
                    }
                    if (this.f4451s != null) {
                        canvas.saveLayer(rectF, this.f4439g);
                        h(canvas);
                        this.f4451s.e(canvas, matrix, i13);
                        canvas.restore();
                    }
                    canvas.restore();
                }
                if (this.f4457y && (c6119a = this.f4458z) != null) {
                    c6119a.setStyle(Paint.Style.STROKE);
                    this.f4458z.setColor(-251901);
                    this.f4458z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF, this.f4458z);
                    this.f4458z.setStyle(Paint.Style.FILL);
                    this.f4458z.setColor(1357638635);
                    canvas.drawRect(rectF, this.f4458z);
                }
                m();
            }
        }
    }

    public final void g() {
        if (this.f4453u != null) {
            return;
        }
        if (this.f4452t == null) {
            this.f4453u = Collections.emptyList();
            return;
        }
        this.f4453u = new ArrayList();
        for (b bVar = this.f4452t; bVar != null; bVar = bVar.f4452t) {
            this.f4453u.add(bVar);
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF = this.f4441i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f4440h);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i10);

    public J0.a j() {
        return this.f4448p.f4492w;
    }

    public z k() {
        return this.f4448p.f4493x;
    }

    public final boolean l() {
        u uVar = this.f4449q;
        if (uVar != null && !((List) uVar.f17492Z).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        E e10 = this.f4447o.f47208Y.f47148a;
        String str = this.f4448p.f4472c;
        if (e10.f1738a) {
            I4.e eVar = (I4.e) ((Map) e10.f1741d).get(str);
            I4.e eVar2 = eVar;
            if (eVar == null) {
                Object obj = new Object();
                ((Map) e10.f1741d).put(str, obj);
                eVar2 = obj;
            }
            int i10 = eVar2.f8053a + 1;
            eVar2.f8053a = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar2.f8053a = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = ((Set) e10.f1739b).iterator();
                if (it.hasNext()) {
                    AbstractC2469q0.p(it.next());
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w4.a, android.graphics.Paint] */
    public void n(boolean z10) {
        if (z10 && this.f4458z == null) {
            this.f4458z = new Paint();
        }
        this.f4457y = z10;
    }

    public void o(float f6) {
        q qVar = this.f4455w;
        y4.e eVar = qVar.f50759j;
        if (eVar != null) {
            eVar.g(f6);
        }
        y4.h hVar = qVar.f50762m;
        if (hVar != null) {
            hVar.g(f6);
        }
        y4.h hVar2 = qVar.f50763n;
        if (hVar2 != null) {
            hVar2.g(f6);
        }
        y4.k kVar = qVar.f50755f;
        if (kVar != null) {
            kVar.g(f6);
        }
        y4.e eVar2 = qVar.f50756g;
        if (eVar2 != null) {
            eVar2.g(f6);
        }
        y4.e eVar3 = qVar.f50757h;
        if (eVar3 != null) {
            eVar3.g(f6);
        }
        y4.h hVar3 = qVar.f50758i;
        if (hVar3 != null) {
            hVar3.g(f6);
        }
        y4.h hVar4 = qVar.f50760k;
        if (hVar4 != null) {
            hVar4.g(f6);
        }
        y4.h hVar5 = qVar.f50761l;
        if (hVar5 != null) {
            hVar5.g(f6);
        }
        u uVar = this.f4449q;
        if (uVar != null) {
            for (int i10 = 0; i10 < ((List) uVar.f17492Z).size(); i10++) {
                ((y4.e) ((List) uVar.f17492Z).get(i10)).g(f6);
            }
        }
        y4.h hVar6 = this.f4450r;
        if (hVar6 != null) {
            hVar6.g(f6);
        }
        b bVar = this.f4451s;
        if (bVar != null) {
            bVar.o(f6);
        }
        ArrayList arrayList = this.f4454v;
        arrayList.size();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((y4.e) arrayList.get(i11)).g(f6);
        }
        arrayList.size();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
    }
}
