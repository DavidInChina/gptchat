package G3;

import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;

/* loaded from: classes.dex */
public final class G extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5887b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f5888c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0605i f5889d;

    public G(C0605i c0605i, ViewGroup viewGroup, View view, View view2) {
        this.f5889d = c0605i;
        this.f5886a = viewGroup;
        this.f5887b = view;
        this.f5888c = view2;
    }

    @Override // G3.t, G3.r
    public final void a() {
        this.f5886a.getOverlay().remove(this.f5887b);
    }

    @Override // G3.r
    public final void d(s sVar) {
        this.f5888c.setTag(R.id.save_overlay_view, null);
        this.f5886a.getOverlay().remove(this.f5887b);
        sVar.w(this);
    }

    @Override // G3.t, G3.r
    public final void e() {
        View view = this.f5887b;
        if (view.getParent() == null) {
            this.f5886a.getOverlay().add(view);
        } else {
            this.f5889d.d();
        }
    }
}
