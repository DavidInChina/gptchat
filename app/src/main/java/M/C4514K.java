package m;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.openai.chatgpt.R;
import java.lang.reflect.Constructor;
import q.C5215i0;
import q.C5230q;
import q.C5233s;
import q.C5235t;
import w.C6049A;

/* renamed from: m.K  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4514K {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f38670b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f38671c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f38672d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f38673e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f38674f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f38675g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final C6049A f38676h = new C6049A();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f38677a = new Object[2];

    public C5230q a(Context context, AttributeSet attributeSet) {
        return new C5230q(context, attributeSet);
    }

    public C5233s b(Context context, AttributeSet attributeSet) {
        return new C5233s(context, attributeSet, R.attr.buttonStyle);
    }

    public C5235t c(Context context, AttributeSet attributeSet) {
        return new C5235t(context, attributeSet, R.attr.checkboxStyle);
    }

    public q.H d(Context context, AttributeSet attributeSet) {
        return new q.H(context, attributeSet);
    }

    public C5215i0 e(Context context, AttributeSet attributeSet) {
        return new C5215i0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        C6049A c6049a = f38676h;
        Constructor constructor = (Constructor) c6049a.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f38670b);
            c6049a.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f38677a);
    }
}
