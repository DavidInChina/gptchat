package H3;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import w.C6059f;

/* loaded from: classes2.dex */
public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f7378a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f7379b;

    /* renamed from: c  reason: collision with root package name */
    public float f7380c;

    /* renamed from: d  reason: collision with root package name */
    public float f7381d;

    /* renamed from: e  reason: collision with root package name */
    public float f7382e;

    /* renamed from: f  reason: collision with root package name */
    public float f7383f;

    /* renamed from: g  reason: collision with root package name */
    public float f7384g;

    /* renamed from: h  reason: collision with root package name */
    public float f7385h;

    /* renamed from: i  reason: collision with root package name */
    public float f7386i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f7387j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7388k;

    /* renamed from: l  reason: collision with root package name */
    public String f7389l;

    public j() {
        this.f7378a = new Matrix();
        this.f7379b = new ArrayList();
        this.f7380c = 0.0f;
        this.f7381d = 0.0f;
        this.f7382e = 0.0f;
        this.f7383f = 1.0f;
        this.f7384g = 1.0f;
        this.f7385h = 0.0f;
        this.f7386i = 0.0f;
        this.f7387j = new Matrix();
        this.f7389l = null;
    }

    @Override // H3.k
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f7379b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // H3.k
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f7379b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f7387j;
        matrix.reset();
        matrix.postTranslate(-this.f7381d, -this.f7382e);
        matrix.postScale(this.f7383f, this.f7384g);
        matrix.postRotate(this.f7380c, 0.0f, 0.0f);
        matrix.postTranslate(this.f7385h + this.f7381d, this.f7386i + this.f7382e);
    }

    public String getGroupName() {
        return this.f7389l;
    }

    public Matrix getLocalMatrix() {
        return this.f7387j;
    }

    public float getPivotX() {
        return this.f7381d;
    }

    public float getPivotY() {
        return this.f7382e;
    }

    public float getRotation() {
        return this.f7380c;
    }

    public float getScaleX() {
        return this.f7383f;
    }

    public float getScaleY() {
        return this.f7384g;
    }

    public float getTranslateX() {
        return this.f7385h;
    }

    public float getTranslateY() {
        return this.f7386i;
    }

    public void setPivotX(float f6) {
        if (f6 != this.f7381d) {
            this.f7381d = f6;
            c();
        }
    }

    public void setPivotY(float f6) {
        if (f6 != this.f7382e) {
            this.f7382e = f6;
            c();
        }
    }

    public void setRotation(float f6) {
        if (f6 != this.f7380c) {
            this.f7380c = f6;
            c();
        }
    }

    public void setScaleX(float f6) {
        if (f6 != this.f7383f) {
            this.f7383f = f6;
            c();
        }
    }

    public void setScaleY(float f6) {
        if (f6 != this.f7384g) {
            this.f7384g = f6;
            c();
        }
    }

    public void setTranslateX(float f6) {
        if (f6 != this.f7385h) {
            this.f7385h = f6;
            c();
        }
    }

    public void setTranslateY(float f6) {
        if (f6 != this.f7386i) {
            this.f7386i = f6;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [H3.i, H3.l] */
    public j(j jVar, C6059f c6059f) {
        l lVar;
        this.f7378a = new Matrix();
        this.f7379b = new ArrayList();
        this.f7380c = 0.0f;
        this.f7381d = 0.0f;
        this.f7382e = 0.0f;
        this.f7383f = 1.0f;
        this.f7384g = 1.0f;
        this.f7385h = 0.0f;
        this.f7386i = 0.0f;
        Matrix matrix = new Matrix();
        this.f7387j = matrix;
        this.f7389l = null;
        this.f7380c = jVar.f7380c;
        this.f7381d = jVar.f7381d;
        this.f7382e = jVar.f7382e;
        this.f7383f = jVar.f7383f;
        this.f7384g = jVar.f7384g;
        this.f7385h = jVar.f7385h;
        this.f7386i = jVar.f7386i;
        String str = jVar.f7389l;
        this.f7389l = str;
        this.f7388k = jVar.f7388k;
        if (str != null) {
            c6059f.put(str, this);
        }
        matrix.set(jVar.f7387j);
        ArrayList arrayList = jVar.f7379b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f7379b.add(new j((j) obj, c6059f));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f7368f = 0.0f;
                    lVar2.f7370h = 1.0f;
                    lVar2.f7371i = 1.0f;
                    lVar2.f7372j = 0.0f;
                    lVar2.f7373k = 1.0f;
                    lVar2.f7374l = 0.0f;
                    lVar2.f7375m = Paint.Cap.BUTT;
                    lVar2.f7376n = Paint.Join.MITER;
                    lVar2.f7377o = 4.0f;
                    lVar2.f7367e = iVar.f7367e;
                    lVar2.f7368f = iVar.f7368f;
                    lVar2.f7370h = iVar.f7370h;
                    lVar2.f7369g = iVar.f7369g;
                    lVar2.f7392c = iVar.f7392c;
                    lVar2.f7371i = iVar.f7371i;
                    lVar2.f7372j = iVar.f7372j;
                    lVar2.f7373k = iVar.f7373k;
                    lVar2.f7374l = iVar.f7374l;
                    lVar2.f7375m = iVar.f7375m;
                    lVar2.f7376n = iVar.f7376n;
                    lVar2.f7377o = iVar.f7377o;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f7379b.add(lVar);
                Object obj2 = lVar.f7391b;
                if (obj2 != null) {
                    c6059f.put(obj2, lVar);
                }
            }
        }
    }
}
