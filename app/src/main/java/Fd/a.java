package Fd;

import Z.AbstractC1725n;
import com.openai.voice.assistant.AssistantActivity;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5235Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AssistantActivity f5236Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(AssistantActivity assistantActivity, int i10) {
        super(2);
        this.f5235Y = i10;
        this.f5236Z = assistantActivity;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f5235Y;
        AssistantActivity assistantActivity = this.f5236Z;
        switch (i11) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Object b10 = ld.g.f38286a.b(pd.h.class);
                if (b10 != null) {
                    A7.b.F(false, R4.b.X(abstractC1725n, 337254051, new gc.l((pd.g) ((f9.p) ((pd.h) b10)).Q.get(), 6, assistantActivity)), abstractC1725n, 48, 1);
                    return;
                }
                throw new ld.h("Couldn't find component of type ".concat(pd.h.class.getName()));
            default:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                A7.b.k(p9.m.f42797a.b(assistantActivity), R4.b.X(abstractC1725n, -1224130209, new a(assistantActivity, 0)), abstractC1725n, 56);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f5235Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
