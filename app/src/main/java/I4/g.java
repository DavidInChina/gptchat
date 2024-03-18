package I4;

import H0.C0672c0;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final C0672c0 f8055a = new C0672c0(1);

    /* renamed from: b  reason: collision with root package name */
    public static final C0672c0 f8056b = new C0672c0(2);

    /* renamed from: c  reason: collision with root package name */
    public static final C0672c0 f8057c = new C0672c0(3);

    /* renamed from: d  reason: collision with root package name */
    public static final C0672c0 f8058d = new C0672c0(4);

    /* renamed from: e  reason: collision with root package name */
    public static final float f8059e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f6, float f10, float f11) {
        PathMeasure pathMeasure = (PathMeasure) f8055a.get();
        Path path2 = (Path) f8056b.get();
        Path path3 = (Path) f8057c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f6 != 1.0f || f10 != 0.0f) && length >= 1.0f && Math.abs((f10 - f6) - 1.0f) >= 0.01d) {
            float f12 = f6 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = f.c(min, length);
                max = f.c(max, length);
            }
            if (min < 0.0f) {
                min = f.c(min, length);
            }
            if (max < 0.0f) {
                max = f.c(max, length);
            }
            int i10 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i10 == 0) {
                path.reset();
                return;
            }
            if (i10 >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f8058d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f6 = f8059e;
        fArr[2] = f6;
        fArr[3] = f6;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap e(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
