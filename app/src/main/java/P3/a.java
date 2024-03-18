package P3;

import L3.s;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f13801c = s.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f13802a;

    /* renamed from: b  reason: collision with root package name */
    public final R4.a f13803b;

    public a(Context context, R4.a aVar) {
        this.f13803b = aVar;
        this.f13802a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
