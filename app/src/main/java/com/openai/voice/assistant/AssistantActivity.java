package com.openai.voice.assistant;

import Fd.a;
import android.os.Bundle;
import com.pairip.licensecheck3.LicenseClientV3;
import h.AbstractC3284j;
import h0.C3288a;
import kotlin.Metadata;
import m.AbstractActivityC4532l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/openai/voice/assistant/AssistantActivity;", "Lm/l;", "<init>", "()V", "voice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantActivity extends AbstractActivityC4532l {
    @Override // V1.AbstractActivityC1483y, g.AbstractActivityC3122o, o1.AbstractActivityC4898m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LicenseClientV3.onActivityCreate(this);
        super.onCreate(bundle);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        AbstractC3284j.a(this, new C3288a(new a(this, 1), true, 539159711));
    }
}
