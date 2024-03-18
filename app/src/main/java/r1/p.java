package r1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.util.WeakHashMap;
import nf.AbstractC4828h;
import org.xmlpull.v1.XmlPullParserException;
import s1.AbstractC5528j;
import w.C6068o;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f44306a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f44307b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f44308c = new Object();

    public static void a(l lVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f44308c) {
            try {
                WeakHashMap weakHashMap = f44307b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(lVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(lVar, sparseArray);
                }
                sparseArray.append(i10, new k(colorStateList, lVar.f44298a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface b(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface c(Context context, int i10, TypedValue typedValue, int i11, AbstractC5355b abstractC5355b, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (!charSequence2.startsWith("res/")) {
                if (abstractC5355b != null) {
                    abstractC5355b.a(-3);
                }
            } else {
                int i12 = typedValue.assetCookie;
                C6068o c6068o = AbstractC5528j.f45114b;
                Typeface typeface2 = (Typeface) c6068o.b(AbstractC5528j.b(resources, i10, charSequence2, i12, i11));
                if (typeface2 != null) {
                    if (abstractC5355b != null) {
                        abstractC5355b.b(typeface2);
                    }
                } else if (!z11) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            e b02 = AbstractC4828h.b0(resources.getXml(i10), resources);
                            if (b02 == null) {
                                AbstractC3612c.c("ResourcesCompat", "Failed to find font-family tag");
                                if (abstractC5355b != null) {
                                    abstractC5355b.a(-3);
                                }
                            } else {
                                typeface = AbstractC5528j.a(context, b02, resources, i10, charSequence2, typedValue.assetCookie, i11, abstractC5355b, z10);
                            }
                        } else {
                            int i13 = typedValue.assetCookie;
                            typeface2 = AbstractC5528j.f45113a.I(context, resources, i10, charSequence2, i11);
                            if (typeface2 != null) {
                                c6068o.c(AbstractC5528j.b(resources, i10, charSequence2, i13, i11), typeface2);
                            }
                            if (abstractC5355b != null) {
                                if (typeface2 != null) {
                                    abstractC5355b.b(typeface2);
                                } else {
                                    abstractC5355b.a(-3);
                                }
                            }
                        }
                    } catch (IOException e10) {
                        AbstractC3612c.d("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e10);
                        if (abstractC5355b != null) {
                            abstractC5355b.a(-3);
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    } catch (XmlPullParserException e11) {
                        AbstractC3612c.d("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e11);
                        if (abstractC5355b != null) {
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    }
                }
                typeface = typeface2;
            }
            if (typeface != null && abstractC5355b == null && !z11) {
                throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
            }
            return typeface;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
    }
}
