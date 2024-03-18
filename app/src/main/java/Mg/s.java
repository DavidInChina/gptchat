package mg;

import id.AbstractC3557B;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;

/* loaded from: classes2.dex */
public final class s implements o {

    /* renamed from: X  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f39322X;

    /* renamed from: A  reason: collision with root package name */
    public final q f39323A;

    /* renamed from: F  reason: collision with root package name */
    public final q f39328F;

    /* renamed from: G  reason: collision with root package name */
    public final q f39329G;

    /* renamed from: I  reason: collision with root package name */
    public final q f39331I;

    /* renamed from: J  reason: collision with root package name */
    public final q f39332J;

    /* renamed from: O  reason: collision with root package name */
    public final q f39337O;
    public final q P;
    public final q Q;

    /* renamed from: R  reason: collision with root package name */
    public final q f39338R;
    public final q S;
    public final q T;

    /* renamed from: U  reason: collision with root package name */
    public final q f39339U;

    /* renamed from: V  reason: collision with root package name */
    public final q f39340V;

    /* renamed from: W  reason: collision with root package name */
    public final q f39341W;

    /* renamed from: a  reason: collision with root package name */
    public boolean f39342a;

    /* renamed from: c  reason: collision with root package name */
    public final q f39344c;

    /* renamed from: d  reason: collision with root package name */
    public final q f39345d;

    /* renamed from: f  reason: collision with root package name */
    public final q f39347f;

    /* renamed from: g  reason: collision with root package name */
    public final q f39348g;

    /* renamed from: h  reason: collision with root package name */
    public final q f39349h;

    /* renamed from: i  reason: collision with root package name */
    public final q f39350i;

    /* renamed from: j  reason: collision with root package name */
    public final q f39351j;

    /* renamed from: k  reason: collision with root package name */
    public final q f39352k;

    /* renamed from: l  reason: collision with root package name */
    public final q f39353l;

    /* renamed from: m  reason: collision with root package name */
    public final q f39354m;

    /* renamed from: n  reason: collision with root package name */
    public final q f39355n;

    /* renamed from: o  reason: collision with root package name */
    public final q f39356o;

    /* renamed from: p  reason: collision with root package name */
    public final q f39357p;

    /* renamed from: q  reason: collision with root package name */
    public final q f39358q;

    /* renamed from: r  reason: collision with root package name */
    public final q f39359r;

    /* renamed from: s  reason: collision with root package name */
    public final q f39360s;

    /* renamed from: t  reason: collision with root package name */
    public final q f39361t;

    /* renamed from: u  reason: collision with root package name */
    public final q f39362u;

    /* renamed from: w  reason: collision with root package name */
    public final q f39364w;

    /* renamed from: x  reason: collision with root package name */
    public final q f39365x;

    /* renamed from: b  reason: collision with root package name */
    public final q f39343b = new q(C4654d.f39288a, this);

    /* renamed from: e  reason: collision with root package name */
    public final q f39346e = new q(n.f39301Z, this);

    /* renamed from: v  reason: collision with root package name */
    public final q f39363v = new q(null, this);

    /* renamed from: y  reason: collision with root package name */
    public final q f39366y = new q(r.f39321Y, this);

    /* renamed from: z  reason: collision with root package name */
    public final q f39367z = new q(p.f39319Y, this);

    /* renamed from: B  reason: collision with root package name */
    public final q f39324B = new q(v.f39371Z, this);

    /* renamed from: C  reason: collision with root package name */
    public final q f39325C = new q(h.f39291a, this);

    /* renamed from: D  reason: collision with root package name */
    public final q f39326D = new q(EnumC4650A.f39279Y, this);

    /* renamed from: E  reason: collision with root package name */
    public final q f39327E = new q(w.f39373Y, this);

    /* renamed from: H  reason: collision with root package name */
    public final q f39330H = new q(x.f39377Y, this);

    /* renamed from: K  reason: collision with root package name */
    public final q f39333K = new q(kf.x.f37485Y, this);

    /* renamed from: L  reason: collision with root package name */
    public final q f39334L = new q(t.f39368a, this);

    /* renamed from: M  reason: collision with root package name */
    public final q f39335M = new q(null, this);

    /* renamed from: N  reason: collision with root package name */
    public final q f39336N = new q(EnumC4651a.f39282h0, this);

    static {
        D d10 = C.f37623a;
        f39322X = new Df.v[]{d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "withDefinedIn", "getWithDefinedIn()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "modifiers", "getModifiers()Ljava/util/Set;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "startFromName", "getStartFromName()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "debugMode", "getDebugMode()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "verbose", "getVerbose()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "unitReturnType", "getUnitReturnType()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "withoutReturnType", "getWithoutReturnType()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "enhancedTypes", "getEnhancedTypes()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderDefaultModality", "getRenderDefaultModality()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "receiverAfterName", "getReceiverAfterName()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), d10.e(new kotlin.jvm.internal.q(d10.b(s.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public s() {
        Boolean bool = Boolean.TRUE;
        this.f39344c = new q(bool, this);
        this.f39345d = new q(bool, this);
        Boolean bool2 = Boolean.FALSE;
        this.f39347f = new q(bool2, this);
        this.f39348g = new q(bool2, this);
        this.f39349h = new q(bool2, this);
        this.f39350i = new q(bool2, this);
        this.f39351j = new q(bool2, this);
        this.f39352k = new q(bool, this);
        this.f39353l = new q(bool2, this);
        this.f39354m = new q(bool2, this);
        this.f39355n = new q(bool2, this);
        this.f39356o = new q(bool, this);
        this.f39357p = new q(bool, this);
        this.f39358q = new q(bool2, this);
        this.f39359r = new q(bool2, this);
        this.f39360s = new q(bool2, this);
        this.f39361t = new q(bool2, this);
        this.f39362u = new q(bool2, this);
        this.f39364w = new q(bool2, this);
        this.f39365x = new q(bool2, this);
        this.f39323A = new q(bool, this);
        this.f39328F = new q(bool2, this);
        this.f39329G = new q(bool2, this);
        this.f39331I = new q(bool2, this);
        this.f39332J = new q(bool2, this);
        this.f39337O = new q(bool2, this);
        this.P = new q(bool, this);
        this.Q = new q(bool, this);
        this.f39338R = new q(bool2, this);
        this.S = new q(bool, this);
        this.T = new q(bool, this);
        this.f39339U = new q(bool2, this);
        this.f39340V = new q(bool2, this);
        this.f39341W = new q(bool, this);
    }

    @Override // mg.o
    public final void a() {
        Df.v vVar = f39322X[30];
        this.f39328F.b(Boolean.TRUE, vVar);
    }

    @Override // mg.o
    public final void b() {
        Df.v vVar = f39322X[6];
        this.f39349h.b(Boolean.TRUE, vVar);
    }

    @Override // mg.o
    public final void c() {
        Df.v vVar = f39322X[31];
        this.f39329G.b(Boolean.TRUE, vVar);
    }

    @Override // mg.o
    public final void d(Set set) {
        AbstractC3557B.c0("<set-?>", set);
        this.f39346e.b(set, f39322X[3]);
    }

    @Override // mg.o
    public final boolean e() {
        return ((Boolean) this.f39354m.a(this, f39322X[11])).booleanValue();
    }

    @Override // mg.o
    public final void f() {
        Df.v vVar = f39322X[21];
        this.f39364w.b(Boolean.TRUE, vVar);
    }

    @Override // mg.o
    public final void g(AbstractC4655e abstractC4655e) {
        this.f39343b.b(abstractC4655e, f39322X[0]);
    }

    @Override // mg.o
    public final void h(w wVar) {
        this.f39327E.b(wVar, f39322X[29]);
    }

    @Override // mg.o
    public final void i() {
        Df.v vVar = f39322X[4];
        this.f39347f.b(Boolean.TRUE, vVar);
    }

    @Override // mg.o
    public final void j() {
        Df.v vVar = f39322X[1];
        this.f39344c.b(Boolean.FALSE, vVar);
    }

    @Override // mg.o
    public final boolean k() {
        return ((Boolean) this.f39349h.a(this, f39322X[6])).booleanValue();
    }

    @Override // mg.o
    public final void l() {
        this.f39326D.b(EnumC4650A.f39280Z, f39322X[28]);
    }

    @Override // mg.o
    public final void m() {
        Df.v vVar = f39322X[22];
        this.f39365x.b(Boolean.TRUE, vVar);
    }

    public final Set n() {
        return (Set) this.f39334L.a(this, f39322X[36]);
    }

    public final void o(LinkedHashSet linkedHashSet) {
        this.f39334L.b(linkedHashSet, f39322X[36]);
    }
}
