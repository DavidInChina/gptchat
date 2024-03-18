package r1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.openai.chatgpt.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: r1.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5356c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f44283a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray typedArray;
        int i10;
        float f6;
        float f10;
        int attributeCount;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        TypedValue typedValue;
        int i16;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (name.equals("selector")) {
            ?? r42 = 1;
            int depth2 = xmlResourceParser.getDepth() + 1;
            int[][] iArr2 = new int[20];
            int[] iArr3 = new int[20];
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == r42 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                    break;
                } else if (next != 2 || depth > depth2 || !xmlResourceParser.getName().equals("item")) {
                    int i19 = depth2;
                    ?? r43 = r42 == true ? 1 : 0;
                    ?? r44 = r42 == true ? 1 : 0;
                    ?? r45 = r42 == true ? 1 : 0;
                    ?? r46 = r42 == true ? 1 : 0;
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    r42 = r43;
                    depth2 = i19;
                    i17 = 0;
                } else {
                    int[] iArr4 = n1.a.f39589a;
                    if (theme2 == null) {
                        typedArray = resources2.obtainAttributes(attributeSet2, iArr4);
                    } else {
                        typedArray = theme2.obtainStyledAttributes(attributeSet2, iArr4, i17, i17);
                    }
                    int resourceId = typedArray.getResourceId(i17, -1);
                    if (resourceId != -1) {
                        ThreadLocal threadLocal = f44283a;
                        TypedValue typedValue2 = (TypedValue) threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        resources2.getValue(resourceId, typedValue, r42);
                        int i20 = typedValue.type;
                        if (i20 < 28 || i20 > 31) {
                            try {
                                i10 = a(resources2, resources2.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                                i10 = typedArray.getColor(i17, -65281);
                            }
                            i16 = r42 == true ? 1 : 0;
                            int i21 = r42 == true ? 1 : 0;
                            int i22 = r42 == true ? 1 : 0;
                            int i23 = r42 == true ? 1 : 0;
                            if (!typedArray.hasValue(i16)) {
                                f6 = typedArray.getFloat(r42, 1.0f);
                            } else if (typedArray.hasValue(3)) {
                                f6 = typedArray.getFloat(3, 1.0f);
                            } else {
                                f6 = 1.0f;
                            }
                            if (Build.VERSION.SDK_INT < 31 && typedArray.hasValue(2)) {
                                f10 = typedArray.getFloat(2, -1.0f);
                            } else {
                                f10 = typedArray.getFloat(4, -1.0f);
                            }
                            typedArray.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr5 = new int[attributeCount];
                            int i24 = i17;
                            for (i11 = i24; i11 < attributeCount; i11++) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i11);
                                if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                    int i25 = i24 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i11, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr5[i24] = attributeNameResource;
                                    i24 = i25;
                                }
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr5, i24);
                            float f17 = 0.0f;
                            float f18 = 100.0f;
                            if (f10 < 0.0f && f10 <= 100.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (f6 != 1.0f && !z10) {
                                iArr = trimStateSet;
                                i12 = depth2;
                                z11 = true;
                            } else {
                                int q10 = Gi.e.q((int) ((Color.alpha(i10) * f6) + 0.5f), 0, 255);
                                if (!z10) {
                                    C5354a a5 = C5354a.a(i10);
                                    q qVar = q.f44309k;
                                    float f19 = a5.f44274b;
                                    if (f19 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
                                        iArr = trimStateSet;
                                        i12 = depth2;
                                        z11 = true;
                                        i15 = AbstractC5355b.c(f10);
                                    } else {
                                        float f20 = a5.f44273a;
                                        if (f20 < 0.0f) {
                                            f11 = 0.0f;
                                        } else {
                                            f11 = Math.min(360.0f, f20);
                                        }
                                        float f21 = 0.0f;
                                        float f22 = f19;
                                        C5354a c5354a = null;
                                        boolean z12 = true;
                                        while (true) {
                                            if (Math.abs(f21 - f19) >= 0.4f) {
                                                float f23 = 1000.0f;
                                                float f24 = f17;
                                                float f25 = f18;
                                                float f26 = 1000.0f;
                                                C5354a c5354a2 = null;
                                                while (true) {
                                                    if (Math.abs(f24 - f25) > 0.01f) {
                                                        float f27 = ((f25 - f24) / 2.0f) + f24;
                                                        int c10 = C5354a.b(f27, f22, f11).c(q.f44309k);
                                                        float d10 = AbstractC5355b.d(Color.red(c10));
                                                        float d11 = AbstractC5355b.d(Color.green(c10));
                                                        float d12 = AbstractC5355b.d(Color.blue(c10));
                                                        z11 = true;
                                                        float[] fArr = AbstractC5355b.f44282d[1];
                                                        f13 = 100.0f;
                                                        float f28 = ((d12 * fArr[2]) + ((d11 * fArr[1]) + (d10 * fArr[0]))) / 100.0f;
                                                        if (f28 <= 0.008856452f) {
                                                            f15 = f28 * 903.2963f;
                                                            i12 = depth2;
                                                        } else {
                                                            i12 = depth2;
                                                            f15 = (((float) Math.cbrt(f28)) * 116.0f) - 16.0f;
                                                        }
                                                        float abs = Math.abs(f10 - f15);
                                                        if (abs < 0.2f) {
                                                            C5354a a10 = C5354a.a(c10);
                                                            C5354a b10 = C5354a.b(a10.f44275c, a10.f44274b, f11);
                                                            f16 = f27;
                                                            float f29 = a10.f44276d - b10.f44276d;
                                                            f12 = f11;
                                                            float f30 = a10.f44277e - b10.f44277e;
                                                            float f31 = a10.f44278f - b10.f44278f;
                                                            float f32 = f30 * f30;
                                                            iArr = trimStateSet;
                                                            float pow = (float) (Math.pow(Math.sqrt((f31 * f31) + f32 + (f29 * f29)), 0.63d) * 1.41d);
                                                            if (pow <= 1.0f) {
                                                                f26 = pow;
                                                                c5354a2 = a10;
                                                                f23 = abs;
                                                            }
                                                        } else {
                                                            f16 = f27;
                                                            f12 = f11;
                                                            iArr = trimStateSet;
                                                        }
                                                        f14 = 0.0f;
                                                        if (f23 == 0.0f && f26 == 0.0f) {
                                                            break;
                                                        }
                                                        if (f15 < f10) {
                                                            f24 = f16;
                                                        } else {
                                                            f25 = f16;
                                                        }
                                                        f18 = 100.0f;
                                                        depth2 = i12;
                                                        f11 = f12;
                                                        int[] iArr6 = iArr;
                                                        f17 = 0.0f;
                                                        trimStateSet = iArr6;
                                                    } else {
                                                        i12 = depth2;
                                                        f12 = f11;
                                                        f13 = f18;
                                                        z11 = true;
                                                        float f33 = f17;
                                                        iArr = trimStateSet;
                                                        f14 = f33;
                                                        break;
                                                    }
                                                }
                                                C5354a c5354a3 = c5354a2;
                                                if (z12) {
                                                    if (c5354a3 != null) {
                                                        i15 = c5354a3.c(qVar);
                                                        break;
                                                    }
                                                    f22 = ((f19 - f21) / 2.0f) + f21;
                                                    f18 = f13;
                                                    depth2 = i12;
                                                    f11 = f12;
                                                    z12 = false;
                                                } else {
                                                    if (c5354a3 == null) {
                                                        f19 = f22;
                                                    } else {
                                                        c5354a = c5354a3;
                                                        f21 = f22;
                                                    }
                                                    f22 = ((f19 - f21) / 2.0f) + f21;
                                                    f18 = f13;
                                                    depth2 = i12;
                                                    f11 = f12;
                                                }
                                                int[] iArr7 = iArr;
                                                f17 = f14;
                                                trimStateSet = iArr7;
                                            } else {
                                                iArr = trimStateSet;
                                                i12 = depth2;
                                                z11 = true;
                                                if (c5354a == null) {
                                                    i15 = AbstractC5355b.c(f10);
                                                } else {
                                                    i15 = c5354a.c(qVar);
                                                }
                                            }
                                        }
                                    }
                                    i10 = i15;
                                } else {
                                    iArr = trimStateSet;
                                    i12 = depth2;
                                    z11 = true;
                                }
                                i10 = (16777215 & i10) | (q10 << 24);
                            }
                            i13 = i18 + 1;
                            int i26 = 8;
                            if (i13 > iArr3.length) {
                                if (i18 <= 4) {
                                    i14 = 8;
                                } else {
                                    i14 = i18 * 2;
                                }
                                int[] iArr8 = new int[i14];
                                System.arraycopy(iArr3, 0, iArr8, 0, i18);
                                iArr3 = iArr8;
                            }
                            iArr3[i18] = i10;
                            if (i13 > iArr2.length) {
                                Class<?> componentType = iArr2.getClass().getComponentType();
                                if (i18 > 4) {
                                    i26 = i18 * 2;
                                }
                                ?? r12 = (Object[]) Array.newInstance(componentType, i26);
                                System.arraycopy(iArr2, 0, r12, 0, i18);
                                iArr2 = r12;
                            }
                            iArr2[i18] = iArr;
                            iArr2 = iArr2;
                            attributeSet2 = attributeSet;
                            theme2 = theme;
                            i18 = i13;
                            r42 = z11;
                            depth2 = i12;
                            i17 = 0;
                            resources2 = resources;
                        }
                    }
                    i10 = typedArray.getColor(i17, -65281);
                    i16 = r42 == true ? 1 : 0;
                    int i212 = r42 == true ? 1 : 0;
                    int i222 = r42 == true ? 1 : 0;
                    int i232 = r42 == true ? 1 : 0;
                    if (!typedArray.hasValue(i16)) {
                    }
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    f10 = typedArray.getFloat(4, -1.0f);
                    typedArray.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr52 = new int[attributeCount];
                    int i242 = i17;
                    while (i11 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i242);
                    float f172 = 0.0f;
                    float f182 = 100.0f;
                    if (f10 < 0.0f) {
                    }
                    z10 = false;
                    if (f6 != 1.0f) {
                    }
                    int q102 = Gi.e.q((int) ((Color.alpha(i10) * f6) + 0.5f), 0, 255);
                    if (!z10) {
                    }
                    i10 = (16777215 & i10) | (q102 << 24);
                    i13 = i18 + 1;
                    int i262 = 8;
                    if (i13 > iArr3.length) {
                    }
                    iArr3[i18] = i10;
                    if (i13 > iArr2.length) {
                    }
                    iArr2[i18] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i18 = i13;
                    r42 = z11;
                    depth2 = i12;
                    i17 = 0;
                    resources2 = resources;
                }
            }
            int[] iArr9 = new int[i18];
            int[][] iArr10 = new int[i18];
            System.arraycopy(iArr3, 0, iArr9, 0, i18);
            System.arraycopy(iArr2, 0, iArr10, 0, i18);
            return new ColorStateList(iArr10, iArr9);
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
