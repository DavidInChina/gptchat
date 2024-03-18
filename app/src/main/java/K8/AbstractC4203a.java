package k8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.f;
import com.openai.chatgpt.R;

/* renamed from: k8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4203a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f37199a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f37200b = {R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f37200b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof f) && ((f) context).f24355a == resourceId) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (resourceId != 0 && !z10) {
            f fVar = new f(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f37199a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                fVar.getTheme().applyStyle(resourceId2, true);
            }
            return fVar;
        }
        return context;
    }
}
