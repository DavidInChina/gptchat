package com.statsig.androidsdk;

import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigClient$getStableID$1 extends o implements AbstractC6216a {
    final /* synthetic */ B $result;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$getStableID$1(B b10, StatsigClient statsigClient) {
        super(0);
        this.$result = b10;
        this.this$0 = statsigClient;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        StatsigMetadata statsigMetadata;
        B b10 = this.$result;
        statsigMetadata = this.this$0.statsigMetadata;
        if (statsigMetadata == null) {
            AbstractC3557B.C2("statsigMetadata");
            throw null;
        }
        String stableID = statsigMetadata.getStableID();
        if (stableID == null) {
            stableID = "";
        }
        b10.f37622Y = stableID;
    }
}
