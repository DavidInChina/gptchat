package t1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import io.sentry.android.core.AbstractC3612c;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: t1.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5658d {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC5660f.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e10) {
            AbstractC3612c.d("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            AbstractC3612c.d("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            AbstractC3612c.d("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon icon;
        String str;
        int i10 = iconCompat.f24917a;
        switch (i10) {
            case -1:
                return (Icon) iconCompat.f24918b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) iconCompat.f24918b);
                break;
            case 2:
                if (i10 == -1) {
                    int i11 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f24918b;
                    if (i11 >= 28) {
                        str = AbstractC5660f.b(obj);
                    } else {
                        str = null;
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException e10) {
                            AbstractC3612c.d("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            AbstractC3612c.d("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            AbstractC3612c.d("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else if (i10 == 2) {
                    String str2 = iconCompat.f24926j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f24918b).split(":", -1)[0] : iconCompat.f24926j;
                } else {
                    throw new IllegalStateException("called getResPackage() on " + iconCompat);
                }
                icon = Icon.createWithResource(str, iconCompat.f24921e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) iconCompat.f24918b, iconCompat.f24921e, iconCompat.f24922f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) iconCompat.f24918b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    icon = AbstractC5659e.b((Bitmap) iconCompat.f24918b);
                    break;
                } else {
                    icon = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f24918b, false));
                    break;
                }
            case 6:
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    icon = AbstractC5661g.a(iconCompat.d());
                    break;
                } else if (context != null) {
                    InputStream e13 = iconCompat.e(context);
                    if (e13 != null) {
                        if (i12 >= 26) {
                            icon = AbstractC5659e.b(BitmapFactory.decodeStream(e13));
                            break;
                        } else {
                            icon = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(e13), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                }
        }
        ColorStateList colorStateList = iconCompat.f24923g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f24924h;
        if (mode != IconCompat.f24916k) {
            icon.setTintMode(mode);
        }
        return icon;
    }
}
