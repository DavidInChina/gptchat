package F9;

import android.content.Intent;
import com.openai.chatgpt.R;
import m.AbstractActivityC4532l;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5079Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f5080Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f5081h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f5082i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, Tc.f fVar, AbstractActivityC4532l abstractActivityC4532l, int i10) {
        super(0);
        this.f5079Y = i10;
        this.f5080Z = str;
        this.f5081h0 = fVar;
        this.f5082i0 = abstractActivityC4532l;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f5079Y;
        AbstractActivityC4532l abstractActivityC4532l = this.f5082i0;
        Tc.f fVar = this.f5081h0;
        String str = this.f5080Z;
        switch (i10) {
            case 0:
                if (str == null) {
                    return;
                }
                Tc.f.b(fVar, R.string.downloading_attachment);
                Intent intent = new Intent();
                A7.b.G0(intent, str);
                K8.d.O0(abstractActivityC4532l, fVar, intent);
                return;
            default:
                if (str == null) {
                    return;
                }
                Tc.f.b(fVar, R.string.downloading_spreadsheet);
                Intent intent2 = new Intent();
                A7.b.G0(intent2, str);
                K8.d.O0(abstractActivityC4532l, fVar, intent2);
                return;
        }
    }
}
