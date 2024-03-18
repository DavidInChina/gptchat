package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.gms.internal.play_billing.N;
import io.sentry.android.core.AbstractC3612c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import t1.AbstractC5658d;
import t1.AbstractC5660f;

/* loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f24916k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f24917a;

    /* renamed from: b  reason: collision with root package name */
    public Object f24918b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f24919c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f24920d;

    /* renamed from: e  reason: collision with root package name */
    public int f24921e;

    /* renamed from: f  reason: collision with root package name */
    public int f24922f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f24923g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f24924h;

    /* renamed from: i  reason: collision with root package name */
    public String f24925i;

    /* renamed from: j  reason: collision with root package name */
    public String f24926j;

    public IconCompat() {
        this.f24917a = -1;
        this.f24919c = null;
        this.f24920d = null;
        this.f24921e = 0;
        this.f24922f = 0;
        this.f24923g = null;
        this.f24924h = f24916k;
        this.f24925i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f6 = min;
        float f10 = 0.5f * f6;
        float f11 = 0.9166667f * f10;
        if (z10) {
            float f12 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f24921e = i10;
            if (resources != null) {
                try {
                    iconCompat.f24918b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f24918b = str;
            }
            iconCompat.f24926j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f24917a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Object obj = this.f24918b;
            if (i11 >= 28) {
                return AbstractC5660f.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                AbstractC3612c.d("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                AbstractC3612c.d("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                AbstractC3612c.d("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        } else if (i10 == 2) {
            return this.f24921e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public final Uri d() {
        int i10 = this.f24917a;
        if (i10 == -1) {
            return AbstractC5658d.a(this.f24918b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f24918b);
    }

    public final InputStream e(Context context) {
        Uri d10 = d();
        String scheme = d10.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                File file = new File((String) this.f24918b);
                return N.t(new FileInputStream(file), file);
            } catch (FileNotFoundException e10) {
                AbstractC3612c.s("IconCompat", "Unable to load image from path: " + d10, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(d10);
        } catch (Exception e11) {
            AbstractC3612c.s("IconCompat", "Unable to load image from URI: " + d10, e11);
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f24917a == -1) {
            return String.valueOf(this.f24918b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f24917a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = SDPKeywords.URI;
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f24917a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f24918b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f24918b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f24926j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f24921e);
                if (this.f24922f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f24922f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f24918b);
                break;
        }
        if (this.f24923g != null) {
            sb2.append(" tint=");
            sb2.append(this.f24923g);
        }
        if (this.f24924h != f24916k) {
            sb2.append(" mode=");
            sb2.append(this.f24924h);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f24919c = null;
        this.f24920d = null;
        this.f24921e = 0;
        this.f24922f = 0;
        this.f24923g = null;
        this.f24924h = f24916k;
        this.f24925i = null;
        this.f24917a = i10;
    }
}
