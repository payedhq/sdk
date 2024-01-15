// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             v4.25.1
// source: api/grpc/account_profile.proto

package grpc

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

const (
	AccountProfile_ProfileToProfileTransfer_FullMethodName                 = "/payed_grpc.account_profiles.AccountProfile/ProfileToProfileTransfer"
	AccountProfile_ReverseProfileToProfileTransfer_FullMethodName          = "/payed_grpc.account_profiles.AccountProfile/ReverseProfileToProfileTransfer"
	AccountProfile_FetchProfileToProfileTransferByReference_FullMethodName = "/payed_grpc.account_profiles.AccountProfile/FetchProfileToProfileTransferByReference"
)

// AccountProfileClient is the client API for AccountProfile service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AccountProfileClient interface {
	ProfileToProfileTransfer(ctx context.Context, in *DebitAccountProfileRequest, opts ...grpc.CallOption) (*DebitAccountProfileResponse, error)
	ReverseProfileToProfileTransfer(ctx context.Context, in *ReverseDebitAccountProfileRequest, opts ...grpc.CallOption) (*ReverseDebitAccountProfileResponse, error)
	FetchProfileToProfileTransferByReference(ctx context.Context, in *FetchTransferByReferenceRequest, opts ...grpc.CallOption) (*DebitAccountProfileResponse, error)
}

type accountProfileClient struct {
	cc grpc.ClientConnInterface
}

func NewAccountProfileClient(cc grpc.ClientConnInterface) AccountProfileClient {
	return &accountProfileClient{cc}
}

func (c *accountProfileClient) ProfileToProfileTransfer(ctx context.Context, in *DebitAccountProfileRequest, opts ...grpc.CallOption) (*DebitAccountProfileResponse, error) {
	out := new(DebitAccountProfileResponse)
	err := c.cc.Invoke(ctx, AccountProfile_ProfileToProfileTransfer_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountProfileClient) ReverseProfileToProfileTransfer(ctx context.Context, in *ReverseDebitAccountProfileRequest, opts ...grpc.CallOption) (*ReverseDebitAccountProfileResponse, error) {
	out := new(ReverseDebitAccountProfileResponse)
	err := c.cc.Invoke(ctx, AccountProfile_ReverseProfileToProfileTransfer_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountProfileClient) FetchProfileToProfileTransferByReference(ctx context.Context, in *FetchTransferByReferenceRequest, opts ...grpc.CallOption) (*DebitAccountProfileResponse, error) {
	out := new(DebitAccountProfileResponse)
	err := c.cc.Invoke(ctx, AccountProfile_FetchProfileToProfileTransferByReference_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AccountProfileServer is the server API for AccountProfile service.
// All implementations must embed UnimplementedAccountProfileServer
// for forward compatibility
type AccountProfileServer interface {
	ProfileToProfileTransfer(context.Context, *DebitAccountProfileRequest) (*DebitAccountProfileResponse, error)
	ReverseProfileToProfileTransfer(context.Context, *ReverseDebitAccountProfileRequest) (*ReverseDebitAccountProfileResponse, error)
	FetchProfileToProfileTransferByReference(context.Context, *FetchTransferByReferenceRequest) (*DebitAccountProfileResponse, error)
	mustEmbedUnimplementedAccountProfileServer()
}

// UnimplementedAccountProfileServer must be embedded to have forward compatible implementations.
type UnimplementedAccountProfileServer struct {
}

func (UnimplementedAccountProfileServer) ProfileToProfileTransfer(context.Context, *DebitAccountProfileRequest) (*DebitAccountProfileResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ProfileToProfileTransfer not implemented")
}
func (UnimplementedAccountProfileServer) ReverseProfileToProfileTransfer(context.Context, *ReverseDebitAccountProfileRequest) (*ReverseDebitAccountProfileResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ReverseProfileToProfileTransfer not implemented")
}
func (UnimplementedAccountProfileServer) FetchProfileToProfileTransferByReference(context.Context, *FetchTransferByReferenceRequest) (*DebitAccountProfileResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchProfileToProfileTransferByReference not implemented")
}
func (UnimplementedAccountProfileServer) mustEmbedUnimplementedAccountProfileServer() {}

// UnsafeAccountProfileServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AccountProfileServer will
// result in compilation errors.
type UnsafeAccountProfileServer interface {
	mustEmbedUnimplementedAccountProfileServer()
}

func RegisterAccountProfileServer(s grpc.ServiceRegistrar, srv AccountProfileServer) {
	s.RegisterService(&AccountProfile_ServiceDesc, srv)
}

func _AccountProfile_ProfileToProfileTransfer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DebitAccountProfileRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountProfileServer).ProfileToProfileTransfer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountProfile_ProfileToProfileTransfer_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountProfileServer).ProfileToProfileTransfer(ctx, req.(*DebitAccountProfileRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountProfile_ReverseProfileToProfileTransfer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ReverseDebitAccountProfileRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountProfileServer).ReverseProfileToProfileTransfer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountProfile_ReverseProfileToProfileTransfer_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountProfileServer).ReverseProfileToProfileTransfer(ctx, req.(*ReverseDebitAccountProfileRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountProfile_FetchProfileToProfileTransferByReference_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchTransferByReferenceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountProfileServer).FetchProfileToProfileTransferByReference(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountProfile_FetchProfileToProfileTransferByReference_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountProfileServer).FetchProfileToProfileTransferByReference(ctx, req.(*FetchTransferByReferenceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// AccountProfile_ServiceDesc is the grpc.ServiceDesc for AccountProfile service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var AccountProfile_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "payed_grpc.account_profiles.AccountProfile",
	HandlerType: (*AccountProfileServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ProfileToProfileTransfer",
			Handler:    _AccountProfile_ProfileToProfileTransfer_Handler,
		},
		{
			MethodName: "ReverseProfileToProfileTransfer",
			Handler:    _AccountProfile_ReverseProfileToProfileTransfer_Handler,
		},
		{
			MethodName: "FetchProfileToProfileTransferByReference",
			Handler:    _AccountProfile_FetchProfileToProfileTransferByReference_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "api/grpc/account_profile.proto",
}