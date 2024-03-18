package H3;

import N.C1025i;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import s1.C5527i;
import w.C6049A;
import w.C6059f;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f7394p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f7395a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f7396b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f7397c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f7398d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f7399e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f7400f;

    /* renamed from: g  reason: collision with root package name */
    public final j f7401g;

    /* renamed from: h  reason: collision with root package name */
    public float f7402h;

    /* renamed from: i  reason: collision with root package name */
    public float f7403i;

    /* renamed from: j  reason: collision with root package name */
    public float f7404j;

    /* renamed from: k  reason: collision with root package name */
    public float f7405k;

    /* renamed from: l  reason: collision with root package name */
    public int f7406l;

    /* renamed from: m  reason: collision with root package name */
    public String f7407m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f7408n;

    /* renamed from: o  reason: collision with root package name */
    public final C6059f f7409o;

    /* JADX WARN: Type inference failed for: r0v4, types: [w.A, w.f] */
    public m() {
        this.f7397c = new Matrix();
        this.f7402h = 0.0f;
        this.f7403i = 0.0f;
        this.f7404j = 0.0f;
        this.f7405k = 0.0f;
        this.f7406l = 255;
        this.f7407m = null;
        this.f7408n = null;
        this.f7409o = new C6049A();
        this.f7401g = new j();
        this.f7395a = new Path();
        this.f7396b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
        if (r0.f7373k != 1.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        Matrix matrix2;
        int i12;
        float f6;
        boolean z10;
        Path.FillType fillType;
        float f10;
        float f11;
        Path.FillType fillType2;
        int i13 = 1;
        jVar.f7378a.set(matrix);
        Matrix matrix3 = jVar.f7378a;
        matrix3.preConcat(jVar.f7387j);
        canvas.save();
        ?? r11 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = jVar.f7379b;
            if (i14 < arrayList.size()) {
                k kVar = (k) arrayList.get(i14);
                if (kVar instanceof j) {
                    a((j) kVar, matrix3, canvas, i10, i11);
                    i12 = i13;
                    matrix2 = matrix3;
                } else if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f12 = i10 / this.f7404j;
                    float f13 = i11 / this.f7405k;
                    float min = Math.min(f12, f13);
                    Matrix matrix4 = this.f7397c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    char c10 = r11 == true ? 1 : 0;
                    char c11 = r11 == true ? 1 : 0;
                    matrix2 = matrix3;
                    float f14 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[c10], fArr[i13]), (float) Math.hypot(fArr[2], fArr[3]));
                    if (max > 0.0f) {
                        f6 = Math.abs(f14) / max;
                    } else {
                        f6 = 0.0f;
                    }
                    if (f6 != 0.0f) {
                        Path path = this.f7395a;
                        lVar.getClass();
                        path.reset();
                        C5527i[] c5527iArr = lVar.f7390a;
                        if (c5527iArr != null) {
                            C5527i.b(c5527iArr, path);
                        }
                        Path path2 = this.f7396b;
                        path2.reset();
                        if (lVar instanceof h) {
                            if (lVar.f7392c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f15 = iVar.f7372j;
                            if (f15 == 0.0f) {
                                f10 = 1.0f;
                            } else {
                                f10 = 1.0f;
                            }
                            float f16 = iVar.f7374l;
                            float f17 = (f15 + f16) % f10;
                            float f18 = (iVar.f7373k + f16) % f10;
                            if (this.f7400f == null) {
                                this.f7400f = new PathMeasure();
                            }
                            this.f7400f.setPath(path, r11);
                            float length = this.f7400f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f7400f.getSegment(f19, length, path, true);
                                f11 = 0.0f;
                                this.f7400f.getSegment(0.0f, f20, path, true);
                            } else {
                                f11 = 0.0f;
                                this.f7400f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f11, f11);
                            path2.addPath(path, matrix4);
                            C1025i c1025i = iVar.f7369g;
                            if (((Shader) c1025i.f12351h0) != null || c1025i.f12350Z != 0) {
                                z10 = true;
                            } else {
                                boolean z11 = r11 == true ? 1 : 0;
                                Object[] objArr = r11 == true ? 1 : 0;
                                z10 = z11;
                            }
                            if (z10) {
                                if (this.f7399e == null) {
                                    Paint paint = new Paint(1);
                                    this.f7399e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f7399e;
                                Object obj = c1025i.f12351h0;
                                if (((Shader) obj) != null) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.f7371i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i15 = c1025i.f12350Z;
                                    float f21 = iVar.f7371i;
                                    PorterDuff.Mode mode = p.f7423o0;
                                    paint2.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (iVar.f7392c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            C1025i c1025i2 = iVar.f7367e;
                            if (((Shader) c1025i2.f12351h0) != null || c1025i2.f12350Z != 0) {
                                if (this.f7398d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f7398d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f7398d;
                                Paint.Join join = iVar.f7376n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.f7375m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.f7377o);
                                Object obj2 = c1025i2.f12351h0;
                                if (((Shader) obj2) != null) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.f7370h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i16 = c1025i2.f12350Z;
                                    float f22 = iVar.f7370h;
                                    PorterDuff.Mode mode2 = p.f7423o0;
                                    paint4.setColor((i16 & 16777215) | (((int) (Color.alpha(i16) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.f7368f * f6 * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i12 = 1;
                } else {
                    matrix2 = matrix3;
                    i12 = i13;
                }
                i14 += i12;
                i13 = i12;
                matrix3 = matrix2;
                r11 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f7406l;
    }

    public void setAlpha(float f6) {
        setRootAlpha((int) (f6 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f7406l = i10;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [w.A, w.f] */
    public m(m mVar) {
        this.f7397c = new Matrix();
        this.f7402h = 0.0f;
        this.f7403i = 0.0f;
        this.f7404j = 0.0f;
        this.f7405k = 0.0f;
        this.f7406l = 255;
        this.f7407m = null;
        this.f7408n = null;
        ?? c6049a = new C6049A(0);
        this.f7409o = c6049a;
        this.f7401g = new j(mVar.f7401g, c6049a);
        this.f7395a = new Path(mVar.f7395a);
        this.f7396b = new Path(mVar.f7396b);
        this.f7402h = mVar.f7402h;
        this.f7403i = mVar.f7403i;
        this.f7404j = mVar.f7404j;
        this.f7405k = mVar.f7405k;
        this.f7406l = mVar.f7406l;
        this.f7407m = mVar.f7407m;
        String str = mVar.f7407m;
        if (str != null) {
            c6049a.put(str, this);
        }
        this.f7408n = mVar.f7408n;
    }
}
