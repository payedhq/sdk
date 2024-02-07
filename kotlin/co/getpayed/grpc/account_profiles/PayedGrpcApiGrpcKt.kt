package co.getpayed.grpc.account_profiles

import co.getpayed.grpc.account_profiles.AccountProfileGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * payed_grpc.account_profiles.AccountProfile.
 */
public object AccountProfileGrpcKt {
  public const val SERVICE_NAME: String = AccountProfileGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val profileToProfileTransferMethod:
      MethodDescriptor<DebitAccountProfileRequest, DebitAccountProfileResponse>
    @JvmStatic
    get() = AccountProfileGrpc.getProfileToProfileTransferMethod()

  public val fetchProfileToProfileTransferByReferenceMethod:
      MethodDescriptor<FetchTransferByReferenceRequest, DebitAccountProfileResponse>
    @JvmStatic
    get() = AccountProfileGrpc.getFetchProfileToProfileTransferByReferenceMethod()

  public val validateAccessTokenForProfileMethod:
      MethodDescriptor<ValidateAccessTokenForProfileRequest, ValidateAccessTokenForProfileResponse>
    @JvmStatic
    get() = AccountProfileGrpc.getValidateAccessTokenForProfileMethod()

  public val fetchProfileBalanceMethod:
      MethodDescriptor<FetchProfileBalanceRequest, FetchProfileBalanceResponse>
    @JvmStatic
    get() = AccountProfileGrpc.getFetchProfileBalanceMethod()

  public val notifyProfileMethod: MethodDescriptor<NotifyProfileRequest, NotifyProfileResponse>
    @JvmStatic
    get() = AccountProfileGrpc.getNotifyProfileMethod()

  /**
   * A stub for issuing RPCs to a(n) payed_grpc.account_profiles.AccountProfile service as
   * suspending coroutines.
   */
  @StubFor(AccountProfileGrpc::class)
  public class AccountProfileCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AccountProfileCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AccountProfileCoroutineStub =
        AccountProfileCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun profileToProfileTransfer(request: DebitAccountProfileRequest,
        headers: Metadata = Metadata()): DebitAccountProfileResponse = unaryRpc(
      channel,
      AccountProfileGrpc.getProfileToProfileTransferMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend
        fun fetchProfileToProfileTransferByReference(request: FetchTransferByReferenceRequest,
        headers: Metadata = Metadata()): DebitAccountProfileResponse = unaryRpc(
      channel,
      AccountProfileGrpc.getFetchProfileToProfileTransferByReferenceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun validateAccessTokenForProfile(request: ValidateAccessTokenForProfileRequest,
        headers: Metadata = Metadata()): ValidateAccessTokenForProfileResponse = unaryRpc(
      channel,
      AccountProfileGrpc.getValidateAccessTokenForProfileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun fetchProfileBalance(request: FetchProfileBalanceRequest, headers: Metadata =
        Metadata()): FetchProfileBalanceResponse = unaryRpc(
      channel,
      AccountProfileGrpc.getFetchProfileBalanceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun notifyProfile(request: NotifyProfileRequest, headers: Metadata = Metadata()):
        NotifyProfileResponse = unaryRpc(
      channel,
      AccountProfileGrpc.getNotifyProfileMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the payed_grpc.account_profiles.AccountProfile service based on
   * Kotlin coroutines.
   */
  public abstract class AccountProfileCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * payed_grpc.account_profiles.AccountProfile.ProfileToProfileTransfer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun profileToProfileTransfer(request: DebitAccountProfileRequest):
        DebitAccountProfileResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method payed_grpc.account_profiles.AccountProfile.ProfileToProfileTransfer is unimplemented"))

    /**
     * Returns the response to an RPC for
     * payed_grpc.account_profiles.AccountProfile.FetchProfileToProfileTransferByReference.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun fetchProfileToProfileTransferByReference(request: FetchTransferByReferenceRequest):
        DebitAccountProfileResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method payed_grpc.account_profiles.AccountProfile.FetchProfileToProfileTransferByReference is unimplemented"))

    /**
     * Returns the response to an RPC for
     * payed_grpc.account_profiles.AccountProfile.ValidateAccessTokenForProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun validateAccessTokenForProfile(request: ValidateAccessTokenForProfileRequest):
        ValidateAccessTokenForProfileResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method payed_grpc.account_profiles.AccountProfile.ValidateAccessTokenForProfile is unimplemented"))

    /**
     * Returns the response to an RPC for
     * payed_grpc.account_profiles.AccountProfile.FetchProfileBalance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun fetchProfileBalance(request: FetchProfileBalanceRequest):
        FetchProfileBalanceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method payed_grpc.account_profiles.AccountProfile.FetchProfileBalance is unimplemented"))

    /**
     * Returns the response to an RPC for payed_grpc.account_profiles.AccountProfile.NotifyProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun notifyProfile(request: NotifyProfileRequest): NotifyProfileResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method payed_grpc.account_profiles.AccountProfile.NotifyProfile is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountProfileGrpc.getProfileToProfileTransferMethod(),
      implementation = ::profileToProfileTransfer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountProfileGrpc.getFetchProfileToProfileTransferByReferenceMethod(),
      implementation = ::fetchProfileToProfileTransferByReference
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountProfileGrpc.getValidateAccessTokenForProfileMethod(),
      implementation = ::validateAccessTokenForProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountProfileGrpc.getFetchProfileBalanceMethod(),
      implementation = ::fetchProfileBalance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountProfileGrpc.getNotifyProfileMethod(),
      implementation = ::notifyProfile
    )).build()
  }
}
