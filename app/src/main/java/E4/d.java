package E4;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import v4.C5971a;
import v4.l;
import v4.m;
import w4.C6119a;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: C  reason: collision with root package name */
    public final C6119a f4466C = new Paint(3);

    /* renamed from: D  reason: collision with root package name */
    public final Rect f4467D = new Rect();

    /* renamed from: E  reason: collision with root package name */
    public final Rect f4468E = new Rect();

    /* renamed from: F  reason: collision with root package name */
    public final m f4469F;

    /* JADX WARN: Type inference failed for: r0v0, types: [w4.a, android.graphics.Paint] */
    public d(l lVar, e eVar) {
        super(lVar, eVar);
        m mVar;
        C5971a c5971a = lVar.f47208Y;
        if (c5971a == null) {
            mVar = null;
        } else {
            mVar = (m) c5971a.c().get(eVar.f4476g);
        }
        this.f4469F = mVar;
    }

    @Override // E4.b, x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        m mVar = this.f4469F;
        if (mVar != null) {
            float c10 = I4.g.c();
            rectF.set(0.0f, 0.0f, mVar.f47229a * c10, mVar.f47230b * c10);
            this.f4446n.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    @Override // E4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmap;
        Context context;
        String str = this.f4448p.f4476g;
        l lVar = this.f4447o;
        A4.a aVar = lVar.f47213k0;
        Bitmap bitmap2 = null;
        if (aVar != null) {
            Drawable.Callback callback = lVar.getCallback();
            if (callback == null || !(callback instanceof View)) {
                context = null;
            } else {
                context = ((View) callback).getContext();
            }
            Context context2 = aVar.f651a;
            if (context2 instanceof Application) {
                context = context.getApplicationContext();
            }
            if (context != context2) {
                lVar.f47213k0 = null;
            }
        }
        if (lVar.f47213k0 == null) {
            lVar.f47213k0 = new A4.a(lVar.getCallback(), lVar.f47208Y.c());
        }
        A4.a aVar2 = lVar.f47213k0;
        if (aVar2 != null) {
            String str2 = aVar2.f652b;
            m mVar = (m) aVar2.f653c.get(str);
            if (mVar != null) {
                bitmap = mVar.f47234f;
                if (bitmap == null) {
                    Context context3 = aVar2.f651a;
                    if (context3 != null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        String str3 = mVar.f47232d;
                        if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
                            try {
                                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                synchronized (A4.a.f650d) {
                                    ((m) aVar2.f653c.get(str)).f47234f = bitmap;
                                }
                            } catch (IllegalArgumentException e10) {
                                I4.b.b("data URL did not have correct base64 format.", e10);
                            }
                        } else {
                            try {
                                if (!TextUtils.isEmpty(str2)) {
                                    try {
                                        Bitmap decodeStream = BitmapFactory.decodeStream(context3.getAssets().open(str2 + str3), null, options);
                                        if (decodeStream == null) {
                                            I4.b.a("Decoded image `" + str + "` is null.");
                                        } else {
                                            bitmap = I4.g.e(decodeStream, mVar.f47229a, mVar.f47230b);
                                            aVar2.a(str, bitmap);
                                        }
                                    } catch (IllegalArgumentException e11) {
                                        I4.b.b("Unable to decode image `" + str + "`.", e11);
                                    }
                                } else {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                            } catch (IOException e12) {
                                I4.b.b("Unable to open asset.", e12);
                            }
                        }
                    }
                }
                m mVar2 = this.f4469F;
                if (bitmap == null) {
                    bitmap2 = bitmap;
                } else if (mVar2 != null) {
                    bitmap2 = mVar2.f47234f;
                }
                if (bitmap2 == null && !bitmap2.isRecycled() && mVar2 != null) {
                    float c10 = I4.g.c();
                    C6119a c6119a = this.f4466C;
                    c6119a.setAlpha(i10);
                    canvas.save();
                    canvas.concat(matrix);
                    int width = bitmap2.getWidth();
                    int height = bitmap2.getHeight();
                    Rect rect = this.f4467D;
                    rect.set(0, 0, width, height);
                    boolean z10 = lVar.f47217o0;
                    Rect rect2 = this.f4468E;
                    if (z10) {
                        rect2.set(0, 0, (int) (mVar2.f47229a * c10), (int) (mVar2.f47230b * c10));
                    } else {
                        rect2.set(0, 0, (int) (bitmap2.getWidth() * c10), (int) (bitmap2.getHeight() * c10));
                    }
                    canvas.drawBitmap(bitmap2, rect, rect2, c6119a);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        bitmap = null;
        m mVar22 = this.f4469F;
        if (bitmap == null) {
        }
        if (bitmap2 == null) {
        }
    }
}
