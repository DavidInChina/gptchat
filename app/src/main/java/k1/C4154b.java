package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import z.AbstractC6708l;

/* renamed from: k1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4154b {

    /* renamed from: a  reason: collision with root package name */
    public int f36768a;

    /* renamed from: b  reason: collision with root package name */
    public int f36769b;

    /* renamed from: c  reason: collision with root package name */
    public float f36770c;

    /* renamed from: d  reason: collision with root package name */
    public String f36771d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36772e;

    /* renamed from: f  reason: collision with root package name */
    public int f36773f;

    public C4154b(C4154b c4154b, Object obj) {
        c4154b.getClass();
        this.f36768a = c4154b.f36768a;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, k1.b] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f36947c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i10 = 0;
        Object obj = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i10 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i12;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f36768a = i10;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC6708l.f(this.f36768a)) {
            case 0:
                this.f36769b = ((Integer) obj).intValue();
                return;
            case 1:
                this.f36770c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f36773f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f36771d = (String) obj;
                return;
            case 5:
                this.f36772e = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f36770c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
