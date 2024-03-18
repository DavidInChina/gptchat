package q;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: q.z0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5248z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f43597a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f43597a = field;
    }
}
