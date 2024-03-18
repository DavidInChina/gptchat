package Lc;

import com.openai.chatgpt.R;
import id.AbstractC3557B;
import m.AbstractActivityC4532l;
import o8.AbstractC4949b;

/* loaded from: classes.dex */
public final class v extends AbstractC4949b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f11025a;

    public v(y yVar) {
        this.f11025a = yVar;
    }

    @Override // o8.AbstractC4949b
    public final N7.m a(AbstractActivityC4532l abstractActivityC4532l) {
        throw new l(0);
    }

    @Override // o8.AbstractC4949b
    public final String b() {
        String string = this.f11025a.f11037a.getString(R.string.emulator_token);
        AbstractC3557B.b0("getString(...)", string);
        return string;
    }
}
