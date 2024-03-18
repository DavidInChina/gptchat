package com.revenuecat.purchases.identity;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.IdentityStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class IdentityManager$logOut$1 extends o implements AbstractC6216a {
    final /* synthetic */ k $completion;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$logOut$1(IdentityManager identityManager, k kVar) {
        super(0);
        this.this$0 = identityManager;
        this.$completion = kVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        String generateRandomID;
        IdentityManager identityManager = this.this$0;
        generateRandomID = identityManager.generateRandomID();
        identityManager.resetAndSaveUserID(generateRandomID);
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.LOG_OUT_SUCCESSFUL);
        this.$completion.invoke(null);
    }
}
