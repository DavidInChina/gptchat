package H0;

import Qg.C1209l;
import Sg.C1394f;
import Z.AbstractC1738u;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.openai.chatgpt.R;
import java.util.LinkedHashMap;
import l8.AbstractC4344b;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f7056a = new LinkedHashMap();

    public static final Qg.D0 a(Context context) {
        Qg.D0 d02;
        LinkedHashMap linkedHashMap = f7056a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Pg.k d10 = Bi.c.d(-1, null, 6);
                    C1209l c1209l = new C1209l(new t1(contentResolver, uriFor, new u1(d10, AbstractC5260f.m(Looper.getMainLooper()), 0), d10, context, null));
                    Ng.E0 z10 = Bi.c.z();
                    Tg.e eVar = Ng.Q.f12904a;
                    obj = L4.a.S0(c1209l, new C1394f(AbstractC4344b.Q0(z10, Sg.u.f16684a)), new Qg.C0(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                d02 = (Qg.D0) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d02;
    }

    public static final AbstractC1738u b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC1738u) {
            return (AbstractC1738u) tag;
        }
        return null;
    }
}
