package i0;

import java.util.LinkedHashMap;
import java.util.List;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class n implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f32427a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32428b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f32429c;

    public n(o oVar, String str, AbstractC6216a abstractC6216a) {
        this.f32427a = oVar;
        this.f32428b = str;
        this.f32429c = abstractC6216a;
    }

    public final void a() {
        o oVar = this.f32427a;
        LinkedHashMap linkedHashMap = oVar.f32432c;
        String str = this.f32428b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove(this.f32429c);
        }
        if (list != null && (!list.isEmpty())) {
            oVar.f32432c.put(str, list);
        }
    }
}
